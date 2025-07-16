package com.socialmedia.rajatgram.service.interfac;

import com.socialmedia.rajatgram.model.post.Post;

import java.util.List;
import java.util.Optional;

public interface IPostService {
    Post createPost(Post post);

    List<Post> getAllPosts();

    Optional<Post> getPostById(String postId);

    Post updatePost(String postId, Post updatedPost);

    void deletePost(String postId);

    // Optional extra operations
    Post likePost(String postId, String accountId);

    Post addComment(String postId, String comment);
}
