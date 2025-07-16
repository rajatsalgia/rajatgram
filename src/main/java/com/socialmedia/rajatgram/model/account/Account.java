package com.socialmedia.rajatgram.model.account;

import com.socialmedia.rajatgram.model.common.BeanContextBaseFields;
import com.socialmedia.rajatgram.model.feed.Feed;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Accessors(chain = true)
@Document(collection = "accounts")
public class Account extends BeanContextBaseFields {
    @MongoId
    private String accountId;
    private String userId;
    private String accountType;
    private String status;
    private String feedId; // Reference to the Feed associated with this account to be loaded

}
