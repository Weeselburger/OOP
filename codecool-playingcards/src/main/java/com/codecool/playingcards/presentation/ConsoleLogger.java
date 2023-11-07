package com.codecool.playingcards.presentation;

import com.codecool.playingcards.service.Logger;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {
    @Override
    public void logInfo(String message){
        logMessage(message,"Info");
    }
    @Override
    public void logError(String message){
        logMessage(message,"Error");
    }
    private void logMessage(String message,String type){
        String entry = "[ "+ LocalDateTime.now()+" ]" + type + " : " + message;
        System.out.println(entry);
    }
}
