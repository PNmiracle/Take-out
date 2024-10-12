package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识需要自动填充的公共字段
 */
@Target(ElementType.METHOD)
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface AutoFill {
    OperationType value(); // 获取操作类型
}
