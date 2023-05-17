package com.example.bot.Automate;

import com.example.bot.KeyboardMaker.InlineKeyboardMaker;
import com.example.bot.KeyboardMaker.ReplyKeyboardMaker;
import com.example.bot.Receivers.SendMessageInterface;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Automate {
    public static HashMap<String, SendMessageInterface> createAutomate() {
        HashMap<String, SendMessageInterface> automate = new HashMap<>();

        automate.put("/start", (update, chatId) -> {

            // Список с объектами сообщений
            ArrayList<Object> list = new ArrayList<>();

            // Объект текстового сообщения
            SendMessage msg = new SendMessage();
            msg.setChatId(chatId);
            msg.setText("Приветствую вас!");

            // Привязываем клавиатуру
            msg.setReplyMarkup(InlineKeyboardMaker
                    .oneColumnKeyboard(new String[] {"Пицца!", "Чипсы"}, new String[] {"Call1", "Call2"}));

            // Добавляем в список сообщений текстовое сообщение
            list.add(msg);
            return list;
        });

        automate.put("Call1", ((update, chatId) -> {

            // Список с объектами сообщений
            ArrayList<Object> list = new ArrayList<>();

            // Объект текстового сообщения
            SendMessage msg = new SendMessage();
            msg.setChatId(chatId);
            msg.setText("Выберите пиццу");

            msg.setReplyMarkup(ReplyKeyboardMaker
                    .oneColumnKeyboard(new String[] {"Четыре сыра", "Пеперони", "Жульенчик"}));

            // Добавляем в список сообщений текстовое сообщение
            list.add(msg);
            return list;
        }));

        automate.put("Call2", ((update, chatId) -> {

            // Список с объектами сообщений
            ArrayList<Object> list = new ArrayList<>();
            SendPhoto sendPhoto = new SendPhoto();
            SendMessage sendMessage = new SendMessage();

            // Текстовое сообщение
            sendMessage.setChatId(chatId);
            sendMessage.setText("Помимо фото, можно отправить сразу и текст");

            // Сообщение с изображением
            sendPhoto.setChatId(chatId);
            sendPhoto.setPhoto(new InputFile(new File("./src/main/resources/images/image.jpeg")));
            sendPhoto.setCaption("Вот ваши чипсы!");

            // Добавляем в список сообщений текстовое сообщение и сообщение с изображением
            list.add(sendPhoto);
            list.add(sendMessage);
            return list;
        }));

        automate.put("Четыре сыра", ((update, chatId) -> {

            // Список с объектами сообщений
            ArrayList<Object> list = new ArrayList<>();
            SendMessage sendMessage = new SendMessage();

            // Текстовое сообщение
            sendMessage.setChatId(chatId);
            sendMessage.setText("Получите пиццу четыре сыра");

            list.add(sendMessage);
            return list;
        }));

        automate.put("Пеперони", ((update, chatId) -> {

            // Список с объектами сообщений
            ArrayList<Object> list = new ArrayList<>();
            SendMessage sendMessage = new SendMessage();

            // Текстовое сообщение
            sendMessage.setChatId(chatId);
            sendMessage.setText("Получите пиццу пеперони");

            list.add(sendMessage);
            return list;
        }));

        automate.put("Жульенчик", ((update, chatId) -> {

            // Список с объектами сообщений
            ArrayList<Object> list = new ArrayList<>();
            SendMessage sendMessage = new SendMessage();

            // Текстовое сообщение
            sendMessage.setChatId(chatId);
            sendMessage.setText("Получите пиццу Жульенчик");

            list.add(sendMessage);
            return list;
        }));

        return automate;
    }
}
