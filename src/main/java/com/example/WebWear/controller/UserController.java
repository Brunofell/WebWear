package com.example.WebWear.controller;

import com.example.WebWear.dto.user.UserGetData;
import com.example.WebWear.dto.user.UserRegisterData;
import com.example.WebWear.dto.user.UserUpdateData;
import com.example.WebWear.entity.User;
import com.example.WebWear.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public void post_user(@RequestBody @Valid UserRegisterData data){
        service.post_user(data);
    }

    @GetMapping("/get")
    public List<UserGetData> get_user(){
        return service.get_user();
    }

    @GetMapping("/getPag")
    public ResponseEntity<Page<User>> getUser(
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "5") int pageSize
    ){
        Page<User> users = service.getUser(pageNo, pageSize);
        return ResponseEntity.ok(users);
    }

    @PutMapping("/update")
    public void update_user(@RequestBody @Valid UserUpdateData data){
        service.update_user(data);
    }

    @DeleteMapping("/{id}")
    public void delete_user(@PathVariable Long id){
        service.delete_user(id);
    }
}
