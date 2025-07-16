package com.socialmedia.rajatgram.model.feed;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Accessors(chain = true)
@Document
public class Feed {
    private String feedId;
    private String userId;
    private List<String> postIds; // List of post IDs in this feed
}
