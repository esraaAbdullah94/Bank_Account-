package com.example.Bank.Account.System.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.awt.SystemColor.text;
@RestController
@RequestMapping("/testing")
public class GeneralController {

//    @Autowired
//    SlackClient slackClient;

    @GetMapping(value = "test")
    @PreAuthorize("hasRole('USER')")
    public String test(){
        return "You are User";
    }

//    @GetMapping(value = "slackMessage")
//    public void message(@RequestParam String text){
//        slackClient.sendMessage(text);
//    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminOnly() {
        return "You are an admin!";
    }
}
