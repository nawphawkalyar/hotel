package com.example.hotelmanagementsystem.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public UserProfile() {
    }

    public UserProfile(String firstName, String lastName, String email, String phoneNumber, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @ManyToMany
    private List<Role> roles=new ArrayList<>();


    public void addRole(Role role){
        roles.add(role);
    }
    public void addRoles(ArrayList<Role> list){
        roles.addAll(list);
    }
}
