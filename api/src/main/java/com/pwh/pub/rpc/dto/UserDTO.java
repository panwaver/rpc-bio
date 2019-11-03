package com.pwh.pub.rpc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Waver
 * @date 2019/11/2 22:27
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -3498770488839793626L;
    private String name;
    private int age;
    private String userId;
}
