package com.example.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class BotApplication {
	public static void main(String[] args) {
		try {
			TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
			api.registerBot(new Bot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}
