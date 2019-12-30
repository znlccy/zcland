package com.znlccy.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: User
 * FileName：User.java
 * Description：用户实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-29 20:01		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "User", description = "用户实体类")
public class User implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 8191460413837380178L;

    /**
     * 用户主键
     */
    @ApiModelProperty(value = "用户主键")
    private Long id;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String username;

    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户密码")
    private String password;

    /**
     * 用户邮箱
     */
    @ApiModelProperty(value = "用户邮箱")
    private String email;

    /**
     * 用户手机
     */
    @ApiModelProperty(value = "用户手机")
    private String mobile;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}
