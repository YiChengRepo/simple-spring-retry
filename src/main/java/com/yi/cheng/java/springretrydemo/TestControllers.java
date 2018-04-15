package com.yi.cheng.java.springretrydemo;


import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {

    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    @Retryable(value = {NumberFormatException.class, NullPointerException.class}, maxAttempts = 5)
    public String okController() {
        System.out.println("calling ok");
        return "success";
    }

    @RequestMapping(value = "/format", method = RequestMethod.GET)
    @Retryable(value = {NumberFormatException.class, NullPointerException.class}, maxAttempts = 5)
    public String formatController() {
        System.out.println("calling format ");
        Integer.parseInt("");
        return "success";
    }

    @RequestMapping(value = "/null", method = RequestMethod.GET)
    @Retryable(value = {NumberFormatException.class, NullPointerException.class}, maxAttempts = 5)
    public String nullController() {
        System.out.println("calling null");
        String test = null;
        test.length();
        return "success";
    }

    @Recover
    public String recover(NumberFormatException ex) {
        System.out.println("Recover method - Number of Format Exception");
        return "Recover method - Number of Format Exception";
    }

    @Recover
    public String recover(NullPointerException ex) {
        System.out.println("Recover method - Null point exception");
        return "Recover method - Null Pointer Exception";
    }

}
