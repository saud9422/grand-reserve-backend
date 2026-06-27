package com.Hall.Lawn.Booking.System.Api.DTO;

import com.Hall.Lawn.Booking.System.Api.Entity.User.User;

public class DtoConverter {

    public UserDto toUserDto(User user){
        return new UserDto(
                user.getName(),
                user.getEmail(),
                user.getAddress(),
                user.getPhone()
        );
    }
}
