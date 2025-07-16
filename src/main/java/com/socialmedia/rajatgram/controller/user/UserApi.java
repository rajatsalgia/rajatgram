package com.socialmedia.rajatgram.controller.user;


import com.socialmedia.rajatgram.model.user.User;
import com.socialmedia.rajatgram.service.interfac.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.validation.Validator;

@Slf4j
@Controller
@RequestMapping(value = "/users")
public class UserApi {

    @Autowired
    private UserService userService;

    @PostMapping()
    ResponseEntity<?> createUser(@RequestBody User user){
        return userService.createUser(user);
    }

}
