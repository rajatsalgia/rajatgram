package com.socialmedia.rajatgram.service.interfac;

import com.socialmedia.rajatgram.model.user.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<String> createUser(User user);
}
