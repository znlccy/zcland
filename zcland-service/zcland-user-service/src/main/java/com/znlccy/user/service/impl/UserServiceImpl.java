package com.znlccy.user.service.impl;

import com.znlccy.common.model.User;
import com.znlccy.user.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * FileName：UserServiceImpl.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-30 11:13		create
 */
@Service
public class UserServiceImpl implements IUserService {

    /**
     * 保存用户
     * @param user
     * @return
     */
    @Override
    public int saveUser(User user) {
        return 0;
    }
}
