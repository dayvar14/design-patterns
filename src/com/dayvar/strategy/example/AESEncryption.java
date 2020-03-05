package com.dayvar.strategy.example;

public class AESEncryption implements Encryption {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES on " +message);
    }
}
