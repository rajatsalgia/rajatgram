package com.socialmedia.rajatgram.repo;

import com.socialmedia.rajatgram.model.post.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepo extends MongoRepository<Post, String> {

    // Optional: Find posts by userId
    List<Post> findByUserId(String userId);

    // Optional: Find posts by accountId
    List<Post> findByAccountId(String accountId);

    // Optional: Find posts containing a specific caption keyword
    List<Post> findByCaptionContainingIgnoreCase(String keyword);
}
