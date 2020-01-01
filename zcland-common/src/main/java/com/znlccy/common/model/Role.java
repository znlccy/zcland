package com.znlccy.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: Role
 * FileName：Role.java
 * Description：角色实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-30 10:39		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "Role", description = "角色实体类")
@TableName(value = "TB_ROLE")
public class Role extends Model<Role> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -4074495078612510310L;

    /**
     * 角色主键
     */
    @ApiModelProperty(value = "角色主键", required = false)
    private Long id;

    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称", required = false)
    private String name;

    /**
     * 角色排序
     */
    @ApiModelProperty(value = "角色排序", required = false)
    private Integer sort;

    /**
     * 角色状态 1:可用 0:不接一个
     */
    @ApiModelProperty(value = "角色状态", required = false)
    private boolean enable;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = false)
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间", required = false)
    private Date updateTime;
}
