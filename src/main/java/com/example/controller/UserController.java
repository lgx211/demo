package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.IUserService;

@Controller
@RequestMapping("user")
@Api(value = "用户模块说明", description = "提供用户的增、删、改、查")
public class UserController {

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "添加用户", notes = "放一些信息，供测试判断")
    String addUser() {
        return "这是添加用户！！！";
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "删除用户", notes = "放一些信息，供测试判断")
    String deleteUser() {
        return "这是删除用户！！！";
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    @ApiOperation(value = "修改用户", notes = "放一些信息，供测试判断")
    String updateUser() {
        return "这是修改用户！！！";
    }

    @RequestMapping(value = "/findAllUsers", method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value = "查询用户", notes = "放一些信息，供测试判断")
    String findAllUsers() {
        return "这是查询用户！！！";
    }


    //=============分割线=============
    @Autowired
    private IUserService userService;

    @RequestMapping("/queryUser")
    @ResponseBody
    void queryUser() {
        this.userService.queryUser();
    }

}
