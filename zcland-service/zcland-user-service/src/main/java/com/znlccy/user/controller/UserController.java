package com.znlccy.user.controller;

import com.znlccy.common.model.User;
import com.znlccy.common.response.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * FileName：UserController.java
 * Description：用户控制器
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-30 09:59		create
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping(value = "/add")
    public Result addUser(@RequestBody User user) {
        return Result.success();
    }
}
