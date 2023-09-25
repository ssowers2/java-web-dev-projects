package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String skillsTracker(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here are some programming languages to choose from:</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='/form-results' method='POST'>" +
                "<label>Enter your name and choose your languages: </label>" +
                "<input type='text' name='userName'/>" +
                "<br />" +
                "<br />" +
                "<label>My First Favorite Language: </label>" +
                "<select name='firstLang'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<label>My Second Favorite Language: </label>" +
                "<select name='secondLang'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<label>My Third Favorite Language: </label>" +
                "<select name='thirdLang'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<br />" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form-results")
    public String results(@RequestParam String userName, String firstLang, String secondLang, String thirdLang) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<h2>Here's the user's choices</h2>" +
                "<table>" +
                "<tr>" +
                "<th>First Language</th>" +
                "<th>Second Language</th>" +
                "<th>Third Language</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" + firstLang + "</td>" +
                "<td>" + secondLang + "</td>" +
                "<td>" + thirdLang +"</td>" +
                "</tr>" +
//                "<ol>" +
//                "<li>" + firstLang + "</li>" +
//                "<li>" + secondLang + "</li>" +
//                "<li>" + thirdLang + "</li>" +
//                "</ol>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}