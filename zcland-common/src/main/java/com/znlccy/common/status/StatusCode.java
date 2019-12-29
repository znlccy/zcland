package com.znlccy.common.status;

import com.znlccy.common.constant.StatusConst;

/**
 * ClassName: StatusCode
 * FileName：StatusCode.java
 * Description：返回状态码
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-29 20:05		create
 */
public enum StatusCode {

    SUCEESS(true, StatusConst.SUCCESS, "操作成功"),
    FAILED(false, StatusConst.FAILED, "操作失败"),
    SYSTEM_ERROR(false, StatusConst.SYSTEM_ERROR, "系统错误");

    /**
     *
     */
    private boolean success;

    private Integer code;

    private String message;

    StatusCode(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
