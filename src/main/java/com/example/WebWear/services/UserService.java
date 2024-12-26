package com.example.WebWear.services;

import com.example.WebWear.dto.user.UserRegisterData;
import com.example.WebWear.entity.User;
import com.example.WebWear.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void post_user(UserRegisterData data){
        User user = new User(data);
        userRepository.save(user);
    }

}
