package com.znlccy.common.response;

import com.znlccy.common.status.StatusCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Result
 * FileName：Result.java
 * Description：
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-29 20:02		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    /**
     * 是否成功标志, TRUE: 代表成功, FALSE：代表失败
     */
    private boolean success;

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回提示信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 成功返回内容(不带数据体)
     * @return
     */
    public static Result success() {
        Result<Object> result = new Result<>();
        result.setSuccess(StatusCode.SUCEESS.isSuccess());
        result.setCode(StatusCode.SUCEESS.getCode());
        result.setMessage(StatusCode.SUCEESS.getMessage());
        return result;
    }

    /**
     * 成功返回内容(待数据体)
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result<Object> result = new Result<>();
        result.setSuccess(StatusCode.SUCEESS.isSuccess());
        result.setCode(StatusCode.SUCEESS.getCode());
        result.setMessage(StatusCode.SUCEESS.getMessage());
        result.setData(data);
        return result;
    }

    /**
     * 错误返回内容(不带数据体)
     * @return
     */
    public static Result error() {
        Result<Object> result = new Result<>();
        result.setSuccess(StatusCode.SYSTEM_ERROR.isSuccess());
        result.setCode(StatusCode.SYSTEM_ERROR.getCode());
        result.setMessage(StatusCode.SYSTEM_ERROR.getMessage());
        return result;
    }
}
