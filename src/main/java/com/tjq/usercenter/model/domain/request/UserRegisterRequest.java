package com.tjq.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author tjq
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 7338278317133113020L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;

}
