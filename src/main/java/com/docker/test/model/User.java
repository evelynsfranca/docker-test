package com.docker.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "test_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {    

    @Id
    private String name;
    
    private String email;
}
