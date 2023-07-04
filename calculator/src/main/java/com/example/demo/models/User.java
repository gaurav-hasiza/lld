package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author Gaurav Hasiza
 * @create 04/07/2023
 */
@Getter
@Setter
@ToString(callSuper = true)
public class User extends BaseEntity{
    String userName;
    String address;
}
