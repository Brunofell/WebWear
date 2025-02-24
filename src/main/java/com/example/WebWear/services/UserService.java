package com.example.WebWear.services;

import com.example.WebWear.dto.user.UserGetData;
import com.example.WebWear.dto.user.UserRegisterData;
import com.example.WebWear.dto.user.UserUpdateData;
import com.example.WebWear.entity.User;
import com.example.WebWear.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void post_user(UserRegisterData data){
        User user = new User(data);
        userRepository.save(user);
    }

    @Transactional
    public List<UserGetData> get_user(){
        return userRepository.findAllByActiveTrue().stream().map(UserGetData::new).toList();
    }

    // Paginação??
    @Transactional
    public Page<User> getUser(int pageNo, int pageSize){
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return userRepository.findAll(pageable);
    }


    @Transactional
    public void update_user(UserUpdateData data){
        var user = userRepository.getReferenceById(data.id());
        user.update(data);
    }

    @Transactional
    public void delete_user(Long id){
        var user = userRepository.getReferenceById(id);
        user.delete();
    }

}
