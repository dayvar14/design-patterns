package com.dayvar.strategy.example;

public class DESEncryption implements Encryption {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES on " +message);
    }
}
