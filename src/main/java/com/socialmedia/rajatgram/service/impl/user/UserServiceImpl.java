package com.socialmedia.rajatgram.service.impl.user;

import com.socialmedia.rajatgram.model.user.User;
import com.socialmedia.rajatgram.repo.user.UserRepo;
import com.socialmedia.rajatgram.service.interfac.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo repo;

    @Override
    public ResponseEntity<String> createUser(User userInput){
        User user = repo.findUserByUserName(userInput.getUserName());
        if(user != null){
            return new ResponseEntity<>("User Already Exists with this userName, Please try using different username", HttpStatus.BAD_REQUEST);
        }
        user = repo.findUserByEmailId(userInput.getEmail());
        if(user != null){
            return new ResponseEntity<>("User Already Exists with this email, Please try using different email or login instead", HttpStatus.BAD_REQUEST);
        }
        User savedUser = repo.createUser(userInput);
       if(savedUser != null) {
           return new ResponseEntity<>("User Created Successfully", HttpStatus.OK);
       }
       else {
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
}
