package com.example.bot.KeyboardMaker;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboardMaker {
    public static InlineKeyboardMarkup twoRowsKeyboard() {
        return null;
    }

    public static InlineKeyboardMarkup oneColumnKeyboard(String[] names, String[] callbacks) {
        InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboardList = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            List<InlineKeyboardButton> k = new ArrayList<>();
            InlineKeyboardButton bt = new InlineKeyboardButton();

            bt.setText(names[i]);
            bt.setCallbackData(callbacks[i]);
            k.add(bt);
            keyboardList.add(k);
        }
        keyboardMarkup.setKeyboard(keyboardList);
        return keyboardMarkup;
    }
}
