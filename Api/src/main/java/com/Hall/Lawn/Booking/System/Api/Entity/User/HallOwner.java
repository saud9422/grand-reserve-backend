package com.Hall.Lawn.Booking.System.Api.Entity.User;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("HALL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HallOwner extends User {

    private String business;
    private Boolean is_varified;     // Changed to Boolean
}