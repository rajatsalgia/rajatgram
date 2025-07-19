package com.socialmedia.rajatgram.model.post;

import com.socialmedia.rajatgram.model.common.BeanContextBaseFields;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Accessors(chain = true)
@Document(collection = "posts")
public class Post extends BeanContextBaseFields {
    @Id
    // only image you can post with caption
    private String postId;
    private String accountId; // accountId of the user who created the post
    private String userId;
    private String caption;
    private List<String> imageUrls;
    private List<String> comments;
    private long likesCount;
    private List<String> likedByAccounts; // list of accountIds who liked the post
 // userId of the user who updated the post

}
