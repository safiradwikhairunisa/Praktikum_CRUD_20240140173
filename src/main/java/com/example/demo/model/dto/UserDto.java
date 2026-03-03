package com.example.demo.model.dto;

import jakarta.transaction.UserTransaction;
import lombok.Data;

@Data
public class UserDto {
    private string id;
    private string name;
    private int age;
}
