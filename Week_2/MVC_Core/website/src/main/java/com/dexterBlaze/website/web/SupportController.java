package com.dexterBlaze.website.web;

import com.dexterBlaze.website.domain.SupportUserMessage;
import com.dexterBlaze.website.domain.User;
import com.dexterBlaze.website.domain.UserMessage;
import com.dexterBlaze.website.service.UserCheckService;
import com.dexterBlaze.website.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SupportController {
    @Autowired
    UserMessageService userMessageService;

    @Autowired
    UserCheckService userCheckService;

    //request mapping -> mapping this function to a url path /support matlab /support jb request ho to ye function chalao
    @RequestMapping("/support")
    public String getSupportPage(@RequestParam("id") String id, ModelMap map) {
        //Integer.parseInt -> takes a string and converts it to its value. Eg. String x = "123" converted to no. 123
//        String finalUserMessage = userMessageService.createMessage(Integer.parseInt(id));
        //basically we passing the reference to the instance variable message
        //we are sending data to the jsp here
//        uiModel.addAttribute("message", finalUserMessage);
        String name = userCheckService.checkUser(Integer.parseInt(id) - 1);
        map.addAttribute("message", "Hi, welcome to support page "+ name);
        return "support";
    }
}
