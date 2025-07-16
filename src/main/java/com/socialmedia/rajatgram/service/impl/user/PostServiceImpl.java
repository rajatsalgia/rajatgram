package com.socialmedia.rajatgram.service.impl.user;

import com.socialmedia.rajatgram.model.post.Post;
import com.socialmedia.rajatgram.repo.PostRepo;
import com.socialmedia.rajatgram.service.interfac.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements IPostService {

    @Autowired
    private PostRepo postRepository;

    // CREATE
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    // READ all posts
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // READ post by ID
    public Optional<Post> getPostById(String postId) {
        return postRepository.findById(postId);
    }

    // UPDATE post
    public Post updatePost(String postId, Post updatedPost) {
        Post existingPost = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found with ID: " + postId));

        // Only allow updating caption, images, and comments
        existingPost.setCaption(updatedPost.getCaption());
        existingPost.setImageUrls(updatedPost.getImageUrls());
        existingPost.setComments(updatedPost.getComments());
        existingPost.setLikesCount(updatedPost.getLikesCount());
        existingPost.setLikedByAccounts(updatedPost.getLikedByAccounts());

        return postRepository.save(existingPost);
    }

    // DELETE post
    public void deletePost(String postId) {
        if (!postRepository.existsById(postId)) {
            throw new RuntimeException("Post not found with ID: " + postId);
        }
        postRepository.deleteById(postId);
    }

    // Optional: LIKE post
    public Post likePost(String postId, String accountId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        if (!post.getLikedByAccounts().contains(accountId)) {
            post.getLikedByAccounts().add(accountId);
            post.setLikesCount(post.getLikesCount() + 1);
            return postRepository.save(post);
        }
        return post; // Already liked
    }

    // Optional: ADD comment
    public Post addComment(String postId, String comment) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        post.getComments().add(comment);
        return postRepository.save(post);
    }
}