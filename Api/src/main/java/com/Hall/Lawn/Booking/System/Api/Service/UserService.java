package com.Hall.Lawn.Booking.System.Api.Service;

import com.Hall.Lawn.Booking.System.Api.DTO.UserDto;
import com.Hall.Lawn.Booking.System.Api.Entity.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private com.Hall.Lawn.Booking.System.Api.Repository.UserRepository userRepository;

    public  String saveUser(User  user){

     User Response =   userRepository.save(user);
     if (Response!=null && Response.equals("")){
         return "success";
     }else {
         return "fail";
     }

    }
    public UserDto getUser(String email){
      User user=  userRepository.findByEmail(email);
        return new UserDto(
                user.getName(),
                user.getEmail(),
                user.getAddress(),
                user.getPhone()
        );
    }
}

