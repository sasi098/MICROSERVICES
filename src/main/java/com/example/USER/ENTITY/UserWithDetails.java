package com.example.USER.ENTITY;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithDetails {
    private User user;
    private Post post;
    private Notification notification;
}
