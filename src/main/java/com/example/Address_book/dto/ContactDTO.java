package com.example.Address_book.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDTO {
    private String fullname;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
}