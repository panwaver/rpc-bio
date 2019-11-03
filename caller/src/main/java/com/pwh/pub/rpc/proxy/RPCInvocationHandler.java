package com.pwh.pub.rpc.proxy;

import com.pwh.pub.rpc.api.ServiceMapped;
import com.pwh.pub.rpc.dto.RpcTransformObj;
import com.pwh.pub.rpc.net.SocketBIOClient;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Waver
 * @date 2019/11/3 15:41
 */
public class RPCInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        RpcTransformObj obj = new RpcTransformObj();

        Class<?> clazz = method.getDeclaringClass();
        String fullClassName = clazz.getDeclaredAnnotation(ServiceMapped.class).mppedService();
        obj.setFullClassName(fullClassName);//"com.pwh.pub.rpc.api.impl.UserServiceImpl"
        obj.setMethodName(method.getName());
        obj.setParams(args);

        return new SocketBIOClient().callRemoteService(obj, "localhost", 7777);
    }
}
