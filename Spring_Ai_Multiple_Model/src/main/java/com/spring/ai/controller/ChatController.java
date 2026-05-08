package com.spring.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ChatController {

    ChatClient openAiChatClient;
    ChatClient ollamaChatClient;

    ChatController(@Qualifier( "openAiChatModel") ChatClient OpenAiChatClient,@Qualifier(" OllamaChatModel") ChatClient ollamaChatClient) {
        this.ollamaChatClient=ollamaChatClient;
        this.openAiChatClient=openAiChatClient;
    }

    @GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam(value="q", required = true) String q){

        var result1= this.ollamaChatClient
                .prompt(q)
                .call()
                .content();
        var result2= this.openAiChatClient
                .prompt(q)
                .call()
                .content();

        return ResponseEntity.ok(result1);
    }

}
