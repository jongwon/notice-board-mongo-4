package com.sp.mongo.noticeboard4.service;


import com.sp.mongo.noticeboard4.domain.User;
import com.sp.mongo.noticeboard4.repository.UserRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

@Service
public class UserService {

    private final MongoTemplate mongoTemplate;

    private final UserRepository userRepository;


    public UserService(MongoTemplate mongoTemplate, UserRepository userRepository) {
        this.mongoTemplate = mongoTemplate;
        this.userRepository = userRepository;
    }


    public User save(User user){
        if(StringUtils.isEmpty(user.getUserId())){
            user.setCreatedAt(LocalDateTime.now());
        }
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }



}
