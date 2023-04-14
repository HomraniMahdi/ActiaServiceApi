package com.example.api.Persistence.Entity;

import lombok.Data;

@Data
public class User {
    private Long postId;
    private Long id;
    private String name;
    private String email;
    private String body;
}
