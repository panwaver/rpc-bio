package com.pwh.pub.rpc.api.impl;

import com.pwh.pub.rpc.api.UserService;
import com.pwh.pub.rpc.dto.UserDTO;

import java.util.Random;

/**
 * @author Waver
 * @date 2019/11/2 22:43
 */
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO insertUser(UserDTO userDTO) {
        //TODO Access database...

        System.out.println("UserDTO in:"+userDTO);
        userDTO.setUserId(new Random().nextInt(100000)+"");

        return userDTO;
    }
}
