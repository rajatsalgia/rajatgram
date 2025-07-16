package com.socialmedia.rajatgram.model.user;


import com.socialmedia.rajatgram.model.common.Address;
import com.socialmedia.rajatgram.model.common.BeanContextBaseFields;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;


@Document("user")
@Data
public class User extends BeanContextBaseFields {
    @Id
    private String userId= UUID.randomUUID().toString();
    private String role;

    @Indexed(unique = true, name = "userNameIndex")
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Address address;
    private String email;

    public String getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
