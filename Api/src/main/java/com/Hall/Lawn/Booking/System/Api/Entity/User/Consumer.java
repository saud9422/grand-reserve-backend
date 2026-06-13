package com.Hall.Lawn.Booking.System.Api.Entity.User;

import com.Hall.Lawn.Booking.System.Api.Enums.Gender;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Consumer extends User{
    private Gender gender;
    private String alternate_Phone;
}
