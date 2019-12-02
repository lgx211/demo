package com.example.dao;

import com.example.entity.UserEntity;

import java.util.List;

public interface UserDao {

    List<UserEntity> queryUser();

}
