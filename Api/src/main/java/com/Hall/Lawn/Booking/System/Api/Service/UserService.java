package com.Hall.Lawn.Booking.System.Api.Service;

import com.Hall.Lawn.Booking.System.Api.DTO.DtoConverter;
import com.Hall.Lawn.Booking.System.Api.DTO.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private DtoConverter dtoConverter;
    UserService(){


    }

    public UserDto  getUserByEmail(User){
        return dtoConverter.toUserDto(user)
    }
}
