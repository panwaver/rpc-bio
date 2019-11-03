package com.pwh.pub.rpc;

import com.pwh.pub.rpc.api.UserService;
import com.pwh.pub.rpc.dto.UserDTO;
import com.pwh.pub.rpc.proxy.ProxyFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserService userService = ProxyFactory.getProxyService(UserService.class);
        UserDTO userDTO = new UserDTO();
        userDTO.setName("waver");
        userDTO.setAge(18);
        System.out.println(userService.insertUser(userDTO));
    }
}
