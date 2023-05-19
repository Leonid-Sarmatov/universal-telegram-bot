package com.example.bot.Receivers;

import com.example.bot.Automate.Answer;
import org.telegram.telegrambots.meta.api.objects.Update;
import java.util.ArrayList;

@FunctionalInterface
public interface SendMessageInterface {
    ArrayList<Answer> sendMessage(Update update, String chatId);
}
