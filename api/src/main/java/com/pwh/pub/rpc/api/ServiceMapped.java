package com.pwh.pub.rpc.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 指定实现类的全路径
 * @author Waver
 * @date 2019/11/3 16:11
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceMapped {
    String mppedService();
}
