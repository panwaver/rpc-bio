package com.pwh.pub.rpc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Waver
 * @date 2019/11/2 22:28
 */
@Data
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = -7338823781791143673L;
    private String orderDesc;
    private int price;
}
