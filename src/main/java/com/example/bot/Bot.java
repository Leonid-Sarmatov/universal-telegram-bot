package com.example.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;

import com.example.bot.Receivers.ReceiverAllMessages;

import java.util.List;

@Component
public class Bot extends TelegramLongPollingBot {
    private static ReceiverAllMessages receiverAllMessages = new ReceiverAllMessages();

    @Override
    public String getBotUsername() {
        return "Test_babaika_bot";
    }

    @Override
    public String getBotToken() {
        return "6058196438:AAH2svI0pJAcJ592nIojO1yuv43JwFwRlu4";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() || update.hasCallbackQuery()) {
            try {

                // Отправляем апдейт в ресивер и получаем список с сообщениями
                List<Object> list = receiverAllMessages.receiveAllMessages(update);

                // Обходим список с сообщениями
                for (int i = 0; i < list.size(); i++) {
                    String s = list.get(i).getClass().toString();

                    // Если объект это текстовое сообщение, то делаем соответствующие приведение типа
                    // и отправляем сообщение
                    if (s.equals("class org.telegram.telegrambots.meta.api.methods.send.SendMessage")) {
                        SendMessage m = (SendMessage) list.get(i);
                        execute(m);
                    }

                    // Если объект это сообщение с фото, то делаем соответствующие приведение типа
                    // и отправляем сообщение
                    if (s.equals("class org.telegram.telegrambots.meta.api.methods.send.SendPhoto")) {
                        SendPhoto m = (SendPhoto) list.get(i);
                        execute(m);
                    }
                }

            } catch (Throwable e) {
                System.out.println("Не удалось принять сообщение");
                e.printStackTrace();
            }
        }
    }
}
