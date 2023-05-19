package com.example.bot.Receivers;

import com.example.bot.Automate.Answer;
import com.example.bot.Automate.Automate;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;
import java.util.HashMap;

public class ReceiverAllMessages {
    public ArrayList<Answer> receiveAllMessages(Update update) {
        ArrayList<Answer> messagesList = new ArrayList<>();

        HashMap<String, SendMessageInterface> automate = Automate.createAutomate();

        // Если сообщение имеет калбек, то обрабатываем как нажатие кнопки
        if (update.hasCallbackQuery()) {

            // Получаем айди из каллбека
            String chatId = update.getCallbackQuery().getMessage().getChatId().toString();

            // Вытаскиваем из автомата нужную функцию обработки сообщения
            SendMessageInterface f = automate.get(update.getCallbackQuery().getData());
            messagesList = f.sendMessage(update, chatId);
            return messagesList;
        }

        // Если сообщение имеет текстовое сообщение, то обрабатываем текст сообщения
        if (update.getMessage().hasText()) {

            // Получаем ай ди из сообщения
            String chatId = update.getMessage().getChatId().toString();

            // Вытаскиваем из автомата нужную функцию обработки сообщения
            SendMessageInterface f = automate.get(update.getMessage().getText());
            messagesList = f.sendMessage(update, chatId);
            return messagesList;
        }

        return messagesList;
    }
}
