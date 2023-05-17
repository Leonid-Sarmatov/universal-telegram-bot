package com.example.bot.KeyboardMaker;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class ReplyKeyboardMaker {
    public static ReplyKeyboardMarkup oneColumnKeyboard(String[] names) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboardList = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            KeyboardRow bt = new KeyboardRow();
            bt.add(names[i]);

            keyboardList.add(bt);
        }
        keyboardMarkup.setKeyboard(keyboardList);
        keyboardMarkup.setResizeKeyboard(true);
        return keyboardMarkup;
    }
}
