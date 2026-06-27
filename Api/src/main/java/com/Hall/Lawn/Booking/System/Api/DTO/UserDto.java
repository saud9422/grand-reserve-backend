package com.Hall.Lawn.Booking.System.Api.DTO;

public record UserDto(
        String name,
        String email,
        String address,
        String phone
) {
}