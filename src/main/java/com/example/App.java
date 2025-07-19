package com.example;

/**
 * Hello world application
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello World from Maven!");
        
        App app = new App();
        String greeting = app.getGreeting("Maven");
        System.out.println(greeting);
    }
    
    public String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to build automation.";
    }
}