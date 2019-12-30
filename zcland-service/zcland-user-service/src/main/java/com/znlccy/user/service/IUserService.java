package com.znlccy.user.service;

import com.znlccy.common.model.User;

/**
 * ClassName: IUserService
 * FileName：IUserService.java
 * Description：用户服务接口
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-30 11:12		create
 */
public interface IUserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    int saveUser(User user);
}
