package com.dayvar.strategy;

import com.dayvar.strategy.example.AESEncryption;
import com.dayvar.strategy.example.ChatClient;

public class Example {
    public static void main(String args[]){
        ChatClient client = new ChatClient(new AESEncryption());
        client.send("Hello World");
    }
}
