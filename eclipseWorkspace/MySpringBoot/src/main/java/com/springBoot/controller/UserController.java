package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.Dao.UserDao;
import com.springBoot.entity.User;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path="/user") 
public class UserController {
    
    @Autowired
    private UserDao userDao;
    
    @ApiOperation("新增用户")
    @PostMapping("/user/add")
    public String add(@RequestBody User user) throws Exception {
        
        if(StringUtils.isNotBlank(user.getName()) && StringUtils.isNotBlank(user.getEmail())) {
            userDao.save(user);
            return "保存成功";
        }else {
            throw new Exception("用户信息不完整！");
        }
    }
    
    @ApiOperation("查询所有用户")
    @GetMapping(path="/user/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // 返回一个json类型的user
        return userDao.findAll();
    }
}
