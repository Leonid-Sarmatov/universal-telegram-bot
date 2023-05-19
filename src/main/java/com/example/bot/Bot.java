package com.example.bot;

import com.example.bot.Automate.Answer;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
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
                List<Answer> list = receiverAllMessages.receiveAllMessages(update);

                // Обходим список с сообщениями
                for (Answer answer : list) {
                    if (answer.getSendMessage() != null) {execute(answer.getSendMessage()); }
                    if (answer.getSendPhoto() != null) { execute(answer.getSendPhoto()); }
                    if (answer.getSendDocument() != null) { execute(answer.getSendDocument()); }
                    if (answer.getSendVideo() != null) { execute(answer.getSendVideo()); }
                    if (answer.getSendVideoNote() != null) { execute(answer.getSendVideoNote()); }
                    if (answer.getSendSticker() != null) { execute(answer.getSendSticker()); }
                    if (answer.getSendAudio() != null) { execute(answer.getSendAudio()); }
                    if (answer.getSendVoice() != null) { execute(answer.getSendVoice()); }
                    if (answer.getSendMediaGroup() != null) { execute(answer.getSendMediaGroup()); }
                    if (answer.getSetChatPhoto() != null) { execute(answer.getSetChatPhoto()); }
                    if (answer.getAddStickerToSet() != null) { execute(answer.getAddStickerToSet()); }
                    if (answer.getSetStickerSetThumb() != null) { execute(answer.getSetStickerSetThumb()); }
                    if (answer.getCreateNewStickerSet() != null) { execute(answer.getCreateNewStickerSet()); }
                    if (answer.getUploadStickerFile() != null) { execute(answer.getUploadStickerFile()); }
                    if (answer.getEditMessageMedia() != null) { execute(answer.getEditMessageMedia()); }
                    if (answer.getSendAnimation() != null) { execute(answer.getSendAnimation()); }
                    if (answer.getBotApiMethod() != null) { execute(answer.getBotApiMethod()); }
                }

            } catch (Throwable e) {
                System.out.println("Не удалось принять сообщение");
                e.printStackTrace();
            }
        }
    }
}
