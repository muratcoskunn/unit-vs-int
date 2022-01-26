package com.test.unitvsint.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void hello() {
        Hello hello=new Hello();
        String response = hello.sayHello("World");
        assertEquals("Hello, World",response);
    }
}