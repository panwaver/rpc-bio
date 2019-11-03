package com.pwh.pub.rpc.api;

import com.pwh.pub.rpc.dto.OrderDTO;

/**
 * @author Waver
 * @date 2019/11/2 22:26
 */
public interface OrderService {

    public OrderDTO insertOrder(OrderDTO orderDTO);
}
