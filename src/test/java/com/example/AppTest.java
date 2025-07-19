package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for App class
 */
public class AppTest {
    
    @Test
    public void testGetGreeting() {
        App app = new App();
        String result = app.getGreeting("World");
        assertEquals("Hello, World! Welcome to build automation.", result);
    }
    
    @Test
    public void testGetGreetingWithMaven() {
        App app = new App();
        String result = app.getGreeting("Maven");
        assertEquals("Hello, Maven! Welcome to build automation.", result);
    }
}