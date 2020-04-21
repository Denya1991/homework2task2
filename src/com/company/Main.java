package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        WorkWithFile workWithFile = new WorkWithFile();
        workWithFile.text = "Hello world";
        try {
            workWithFile.save();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
