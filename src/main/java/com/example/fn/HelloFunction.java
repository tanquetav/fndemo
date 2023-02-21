package com.example.fn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloFunction {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    static {
        System.out.println(sdf.format(new Date()) + " Initializing function");
        try {
            Thread.sleep(5000);
        }
        catch (Exception e) {}
        System.out.println(sdf.format(new Date()) + " Initialized function");

    }
    public String handleRequest(String input) {
        String name = (input == null || input.isEmpty()) ? "world"  : input;

        System.out.println(sdf.format(new Date()) + " Inside Java Hello World function");
        return "Hello, " + name + "!";
    }

}
