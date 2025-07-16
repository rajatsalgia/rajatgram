package com.socialmedia.rajatgram.model.common;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BeanContextBaseFields {
    private String createdAt;
    private String updatedAt;
    private String createdBy; // userId of the user who created the post
    private String updatedBy;
}
