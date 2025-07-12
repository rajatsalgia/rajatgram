package com.socialmedia.rajatgram.model.user;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Address {
    private String line1;
    private String line2;
    private String city;
    private String country;
    private long pincode;
}
