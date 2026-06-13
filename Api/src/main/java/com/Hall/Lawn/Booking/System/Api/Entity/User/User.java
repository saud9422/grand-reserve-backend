package com.Hall.Lawn.Booking.System.Api.Entity.User;

import com.Hall.Lawn.Booking.System.Api.Enums.Role;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
    private String name ;
    private String email ;
    private String password ;
    private String address;
    private String phone;
    private Role role;
    private boolean isActive;
    private Data createdOn;
    private Data updatedOn;


}
