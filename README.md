# universal-telegram-bot
Небольшой проект универсального телеграм бота, которого можно гибко настроить
# Класс `Automate`
Функционал бота прописывается в методе `createAutomate()` класса `Automate`.
Метод создает `HashMap<String, SendMessageInterface>`, Где ключ - это каллбек сообщения или само сообщение 
по которому будет вызываться определенное действие бота.

Вы можете добавлять в список функционал по обзазцу
```
automate.put("/start", (update, chatId) -> {

  // List with message objects
  ArrayList<Answer> list = new ArrayList<>();

  // Text message object
  SendMessage msg = new SendMessage();
  msg.setChatId(chatId);
  msg.setText("Greetings!");

  // Create keyboard
  msg.setReplyMarkup(InlineKeyboardMaker
          .oneColumnKeyboard(new String[] {"Pizza!", "Lays!"}, new String[] {"Call1", "Call2"}));

  // Adding a text message to the message list
  Answer answer = new Answer();
  answer.setSendMessage(msg);
  list.add(answer);
  return list;
});

automate.put("Call2", ((update, chatId) -> {

    // List with message objects
    ArrayList<Answer> list = new ArrayList<>();
    SendPhoto sendPhoto = new SendPhoto();
    SendMessage sendMessage = new SendMessage();

    // Text message
    sendMessage.setChatId(chatId);
    sendMessage.setText("In addition to photos, you can send text right away.");

    // Image message
    sendPhoto.setChatId(chatId);
    sendPhoto.setPhoto(new InputFile(new File("./src/main/resources/images/image.jpeg")));
    sendPhoto.setCaption("Here are your chips!");

    // Adding a text message and a message with an image to the message list
    Answer answer = new Answer();
    answer.setSendMessage(sendMessage);
    answer.setSendPhoto(sendPhoto);

    list.add(answer);
    return list;
}));
```
# Пакет `KeyboardMaker`
Пакет содержит слассы для создания различных клавиатур. Каждый метод 
создает клавиатуру определенного вида
