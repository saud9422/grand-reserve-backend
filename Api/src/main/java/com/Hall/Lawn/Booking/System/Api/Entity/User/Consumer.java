package com.Hall.Lawn.Booking.System.Api.Entity.User;

import com.Hall.Lawn.Booking.System.Api.Enums.Gender;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("CONSUMER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumer extends User {

    private Gender gender;
    private String alternate_Phone;
}