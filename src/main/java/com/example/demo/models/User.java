package com.example.demo.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "user")
public class User {
    public User(String _id, String firstName, String lastName, String emailId, Long phoneNumber, String password) {
        this._id = _id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public User(String firstName, String lastName, String emailId, Long phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public User() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Id
    private String _id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Long phoneNumber;
    private String password;
}
