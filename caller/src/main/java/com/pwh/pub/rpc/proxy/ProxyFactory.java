package com.pwh.pub.rpc.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Waver
 * @date 2019/11/3 15:38
 */
public class ProxyFactory {

    public static <T> T getProxyService(Class<T> interfaceClass){
        return (T) Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(),new Class[]{
                interfaceClass
        },new RPCInvocationHandler());
    }

//    public static UserService getUserService(Class interfaceClass){
//        return (UserService) Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(),new Class[]{
//                interfaceClass
//        },new RPCInvocationHandler());
//    }
}
