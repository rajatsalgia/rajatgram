package com.socialmedia.rajatgram.repo.user;

import com.socialmedia.rajatgram.model.user.User;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo extends SimpleMongoRepository<User,String> {

    private final MongoTemplate mongoTemplate;

    public UserRepo(MongoEntityInformation<User, String> metadata, MongoOperations mongoOperations, MongoTemplate mongoTemplate) {
        super(metadata, mongoOperations);
        this.mongoTemplate = mongoTemplate;
    }

    public User createUser(User user){
       return mongoTemplate.save(user);
    }
    public User findUserByUserName(String userName){
        Criteria criteria = Criteria.where("userName").is(userName);
        Query query = Query.query(criteria);
        return mongoTemplate.findOne(query, User.class);
    }
    public User findUserByEmailId(String email) {
        Criteria criteria = Criteria.where("email").is(email);
        Query query = Query.query(criteria);
        return mongoTemplate.findOne(query, User.class);
    }
}
