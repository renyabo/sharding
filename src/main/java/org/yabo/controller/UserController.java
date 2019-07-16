package org.yabo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yabo.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/insert")
    public String insert() {
        userService.insert();
        return "OK";
    }
}
