package com.Hall.Lawn.Booking.System.Api.Entity.User;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HallOwner extends User{
    private String business;
    private boolean is_varified;
}
