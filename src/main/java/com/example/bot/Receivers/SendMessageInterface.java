package com.example.bot.Receivers;

import org.telegram.telegrambots.meta.api.objects.Update;
import java.util.ArrayList;

@FunctionalInterface
public interface SendMessageInterface {
    ArrayList<Object> sendMessage(Update update, String chatId);
}
