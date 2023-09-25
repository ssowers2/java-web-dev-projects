package org.launchcode.hellospring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloWorld {

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name,
                            @RequestParam String language) {

        if(name == null) {
            name = "World";}

        return createMessage(name, language);
    }

    public static  String createMessage(String name, String language) {
        String greeting = "";

        if(language.equals(("english"))) {
            greeting = "Hello";
        }

        else if(language.equals(("french"))) {
            greeting = "Bonjour";
        }

        else if(language.equals("italian")) {
            greeting = "Bonjourno";
        }

        else if(language.equals(("spanish"))) {
            greeting = "Hola";
        }

        else if(language.equals(("german"))) {
            greeting = "Hallo";
        }

        return greeting + " " + name;

    }

}

