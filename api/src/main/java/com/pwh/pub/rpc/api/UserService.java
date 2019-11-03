package com.pwh.pub.rpc.api;

import com.pwh.pub.rpc.dto.UserDTO;

/**
 * @author Waver
 * @date 2019/11/2 22:26
 */
@ServiceMapped(mppedService = "com.pwh.pub.rpc.api.impl.UserServiceImpl")
public interface UserService {

    public UserDTO insertUser(UserDTO userDTO);
}
