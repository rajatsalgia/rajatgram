package com.socialmedia.rajatgram.model.profile;

import com.socialmedia.rajatgram.model.common.BeanContextBaseFields;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
import java.util.UUID;

@Data
@Accessors(chain = true)
@Document
public class Profile extends BeanContextBaseFields {
    @MongoId
    private String profileId = UUID.randomUUID().toString();
    private String userId;
    private String firstName;
    private String lastName;
    private String bio;
    private String profilePictureUrl;
    private String coverPhotoUrl;
    private String dateOfBirth;
    private List<String> imageUrls;
    List<String> followersAccounts; // list of accountIds who follow this profile
    List<String> followingsAccounts; // list of accountIds this profile is following
    private long followersCount;
    private long followingCount;
}
