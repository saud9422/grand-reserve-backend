package com.Hall.Lawn.Booking.System.Api.Entity.User;

import com.Hall.Lawn.Booking.System.Api.Enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.lang.annotation.Inherited;
import java.security.Identity;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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
