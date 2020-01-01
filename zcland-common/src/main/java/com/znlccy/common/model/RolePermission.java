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
 * ClassName: RolePermission
 * FileName：RolePermission.java
 * Description：角色权限实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-31 23:02		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName(value = "TB_ROLE_PERMISSION")
@ApiModel(value = "RolePermission")
public class RolePermission extends Model<RolePermission> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -7928608722256939598L;

    /**
     * 角色主键
     */
    @TableField(value = "ROLE_ID")
    @ApiModelProperty(value = "角色主键", required = false)
    private Long roleId;

    /**
     * 权限主键
     */
    @TableField(value = "PERMISSION_ID")
    @ApiModelProperty(value = "权限主键", required = false)
    private Long permissionId;
}
