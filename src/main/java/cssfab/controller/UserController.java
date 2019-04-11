package cssfab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping("user/login")
    public String login() {
        return "user/login";
    }

    @RequestMapping(value = "user/login", method = RequestMethod.POST)
    public String loginUser() {
        return "redirect:/posts";
    }

    @RequestMapping("user/register")
    public String register() {
        return "user/register";
    }

    @RequestMapping(value = "user/logout", method = RequestMethod.POST)
    public String logout() {
        return "redirect:/";
    }
}
