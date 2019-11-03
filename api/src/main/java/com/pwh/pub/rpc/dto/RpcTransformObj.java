package com.pwh.pub.rpc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Waver
 * @date 2019/11/2 22:51
 */
@Data
public class RpcTransformObj implements Serializable {

    private static final long serialVersionUID = -2044421571165822441L;
    private String fullClassName;
    private String methodName;
    private Object[] params;
}
