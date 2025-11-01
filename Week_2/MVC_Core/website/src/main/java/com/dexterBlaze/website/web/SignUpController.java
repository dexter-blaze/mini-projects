package com.dexterBlaze.website.web;

import com.dexterBlaze.website.domain.StudentUser;
import com.dexterBlaze.website.domain.User;
import com.dexterBlaze.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignUpController {
    @Autowired
    UserService userService;

    @RequestMapping("/signup")
    public String getSignupPage(Model uiModel) {

        User user = userService.getUser();
        uiModel.addAttribute("user", user);
        return "signup";
    }
    /*
    jsp will return the model and we are trying to access the attribute of the model
    which is the object whose data we want to access
    */
    //this function also returns the name of jsp like above function
    @RequestMapping("/registerUser")
    public String createdUser(@ModelAttribute(value = "user") StudentUser studentUser) {
        int userId = userService.signUp(studentUser.getName(), studentUser.getGender(), studentUser.getLocation(), studentUser.getCollege());
        if(userId != -1){
            ModelAndView modelAndView = new ModelAndView("redirect:welcome?id="+userId);
            //instead of sending static page
//            return "welcome"; //for avoiding the syntactical error in beginning.
            return modelAndView.getViewName();
        }
        return "signup";
    }

    @RequestMapping("/welcome")
    public String showWelcomePage(@RequestParam("id") String userId, ModelMap map) {
        map.addAttribute("userId", userId);
        return "welcome";
    }
}
