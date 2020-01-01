package com.znlccy.common.annotation;

import java.lang.annotation.*;

/**
 * ClassName: AuthAnnotation
 * FileName：AuthAnnotation.java
 * Description：权限注解
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-31 21:55		create
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface AuthAnnotation {

}
