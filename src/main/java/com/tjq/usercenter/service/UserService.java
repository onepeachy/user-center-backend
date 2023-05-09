package com.tjq.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tjq.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author taojiaqi
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-04-13 18:45:38
 */
public interface UserService extends IService<User> {

    /**
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword,String planetCode);

    /**
     * @param userAccount
     * @param userPassword
     * @param request
     * @return 返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * @param originUser
     * @return 获取脱敏用户
     */
    User getSafetyUser(User originUser);


    int userLogout(HttpServletRequest request);
}
