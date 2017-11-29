package com.service.mnbk.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMnbk {

        MnbkDelegate mnbkDelegate = new MnbkDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = mnbkDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}