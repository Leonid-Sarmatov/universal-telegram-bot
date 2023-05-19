package com.example.bot.Automate;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.groupadministration.SetChatPhoto;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.methods.stickers.AddStickerToSet;
import org.telegram.telegrambots.meta.api.methods.stickers.CreateNewStickerSet;
import org.telegram.telegrambots.meta.api.methods.stickers.SetStickerSetThumb;
import org.telegram.telegrambots.meta.api.methods.stickers.UploadStickerFile;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia;

public class Answer {
    private SendMessage sendMessage;
    private SendDocument sendDocument;
    private SendPhoto sendPhoto;
    private SendVideo sendVideo;
    private SendVideoNote sendVideoNote;
    private SendSticker sendSticker;
    private SendAudio sendAudio;
    private SendVoice sendVoice;
    private SendMediaGroup sendMediaGroup;
    private SetChatPhoto setChatPhoto;
    private AddStickerToSet addStickerToSet;
    private SetStickerSetThumb setStickerSetThumb;
    private CreateNewStickerSet createNewStickerSet;
    private UploadStickerFile uploadStickerFile;
    private EditMessageMedia editMessageMedia;
    private SendAnimation sendAnimation;
    private BotApiMethod<?> botApiMethod;

    public void setSendMessage(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }

    public void setAddStickerToSet(AddStickerToSet addStickerToSet) {
        this.addStickerToSet = addStickerToSet;
    }

    public void setSendDocument(SendDocument sendDocument) {
        this.sendDocument = sendDocument;
    }

    public void setSendPhoto(SendPhoto sendPhoto) {
        this.sendPhoto = sendPhoto;
    }

    public void setSendSticker(SendSticker sendSticker) {
        this.sendSticker = sendSticker;
    }

    public void setBotApiMethod(BotApiMethod<?> botApiMethod) {
        this.botApiMethod = botApiMethod;
    }

    public void setSendVideo(SendVideo sendVideo) {
        this.sendVideo = sendVideo;
    }

    public void setCreateNewStickerSet(CreateNewStickerSet createNewStickerSet) {
        this.createNewStickerSet = createNewStickerSet;
    }

    public void setSendVideoNote(SendVideoNote sendVideoNote) {
        this.sendVideoNote = sendVideoNote;
    }

    public void setEditMessageMedia(EditMessageMedia editMessageMedia) {
        this.editMessageMedia = editMessageMedia;
    }

    public void setSendAnimation(SendAnimation sendAnimation) {
        this.sendAnimation = sendAnimation;
    }

    public void setSendAudio(SendAudio sendAudio) {
        this.sendAudio = sendAudio;
    }

    public void setSendMediaGroup(SendMediaGroup sendMediaGroup) {
        this.sendMediaGroup = sendMediaGroup;
    }

    public void setSendVoice(SendVoice sendVoice) {
        this.sendVoice = sendVoice;
    }

    public void setSetChatPhoto(SetChatPhoto setChatPhoto) {
        this.setChatPhoto = setChatPhoto;
    }

    public void setSetStickerSetThumb(SetStickerSetThumb setStickerSetThumb) {
        this.setStickerSetThumb = setStickerSetThumb;
    }

    public void setUploadStickerFile(UploadStickerFile uploadStickerFile) {
        this.uploadStickerFile = uploadStickerFile;
    }

    public SendDocument getSendDocument() {
        return sendDocument;
    }

    public SendAudio getSendAudio() {
        return sendAudio;
    }

    public AddStickerToSet getAddStickerToSet() {
        return addStickerToSet;
    }

    public SendPhoto getSendPhoto() {
        return sendPhoto;
    }

    public SendVideo getSendVideo() {
        return sendVideo;
    }

    public SendSticker getSendSticker() {
        return sendSticker;
    }

    public SendVideoNote getSendVideoNote() {
        return sendVideoNote;
    }

    public BotApiMethod<?> getBotApiMethod() {
        return botApiMethod;
    }

    public CreateNewStickerSet getCreateNewStickerSet() {
        return createNewStickerSet;
    }

    public SendMediaGroup getSendMediaGroup() {
        return sendMediaGroup;
    }

    public SendVoice getSendVoice() {
        return sendVoice;
    }

    public EditMessageMedia getEditMessageMedia() {
        return editMessageMedia;
    }

    public SendAnimation getSendAnimation() {
        return sendAnimation;
    }

    public SetChatPhoto getSetChatPhoto() {
        return setChatPhoto;
    }

    public SetStickerSetThumb getSetStickerSetThumb() {
        return setStickerSetThumb;
    }

    public UploadStickerFile getUploadStickerFile() {
        return uploadStickerFile;
    }

    public SendMessage getSendMessage() {
        return sendMessage;
    }
}
