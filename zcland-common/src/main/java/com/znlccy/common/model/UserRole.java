package com.znlccy.common.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * ClassName: UserRole
 * FileName：UserRole.java
 * Description：用户角色实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-01-01 16:38		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName(value = "TB_USER_ROLE")
@ApiModel(value = "UserRole", description = "用户角色")
public class UserRole extends Model<UserRole> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -5386558052708957217L;

    /**
     * 用户主键
     */
    @TableField(value = "USER_ID")
    @ApiModelProperty(value = "用户主键", required = false)
    private Long userId;

    /**
     * 角色主键
     */
    @TableField(value = "ROLE_ID")
    @ApiModelProperty(value = "角色主键", required = false)
    private Long roleId;
}
