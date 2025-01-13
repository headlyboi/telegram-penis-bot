package com.headlyboy.tgdilondobot.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.meta.generics.TelegramClient;

@Getter
@Configuration
public class TelegramClientConfig {
    private final String apiKey;

    public TelegramClientConfig(@Value("${telegram.bot.api.key}") String apiKey) {
        this.apiKey = apiKey;
    }

    @Bean
    public TelegramClient telegramClient() {
        return new OkHttpTelegramClient(apiKey);
    }
}
