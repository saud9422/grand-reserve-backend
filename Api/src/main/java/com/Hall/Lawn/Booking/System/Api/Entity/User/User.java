package com.Hall.Lawn.Booking.System.Api.Entity.User;

import com.Hall.Lawn.Booking.System.Api.Enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Identity;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String email ;
    private String password ;
    private String address;
    private String phone;
    private Role role;
    private boolean isActive;
    private Date createdOn;
    private Date updatedOn;



}
