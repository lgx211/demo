package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceIml implements IUserService {

    @Resource
    private UserDao userDao;

    @Override
    public void queryUser() {
        List<UserEntity> userList = this.userDao.queryUser();
        System.out.println("================");
        System.out.println(userList);
        System.out.println("================");
    }
}
