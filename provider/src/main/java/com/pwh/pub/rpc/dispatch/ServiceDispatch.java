package com.pwh.pub.rpc.dispatch;

import com.pwh.pub.rpc.dto.RpcTransformObj;

import java.lang.reflect.Method;

/**
 * Service delivery
 * network recived data
 * @author Waver
 * @date 2019/11/2 22:45
 */
public class ServiceDispatch {
    public static Object dispatch(Object obj){

        //java reflect

        RpcTransformObj rpcTransformObj = (RpcTransformObj) obj;
        String fullClassName = rpcTransformObj.getFullClassName();
        String methodName = rpcTransformObj.getMethodName();
        Object[] params = rpcTransformObj.getParams();
        Class[] types = new Class[params.length];
        for (int i=0; i<params.length; i ++) {
            types[i] = params[i].getClass();
        }

        Object respObj = null;
        try {
            Class clazz = Class.forName(fullClassName);
            Method method = clazz.getDeclaredMethod(methodName, types);

            respObj = method.invoke(clazz.newInstance(), params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return respObj;
    }
}
