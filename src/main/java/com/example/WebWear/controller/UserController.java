package com.example.WebWear.controller;

import com.example.WebWear.dto.user.UserRegisterData;
import com.example.WebWear.entity.User;
import com.example.WebWear.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public void post_user(@RequestBody @Valid UserRegisterData data){
        service.post_user(data);
    }


}
