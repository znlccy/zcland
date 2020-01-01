package com.znlccy.common.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * ClassName: Permission
 * FileName：Permission.java
 * Description：权限实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-01-01 12:10		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName(value = "tb_permission")
@ApiModel(value = "Permission", description = "权限实体类")
public class Permission extends Model<Permission> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 2955055022953825010L;

    /**
     * 权限主键
     */
    @TableId(value = "ID")
    @ApiModelProperty(value = "权限主键", required = false)
    private Long id;

    /**
     * 权限名称
     */
    @TableField(value = "NAME")
    @ApiModelProperty(value = "权限名称", required = false)
    private String name;

    /**
     * 权限路径
     */
    @TableField(value = "URL")
    @ApiModelProperty(value = "权限路径", required = false)
    private String url;

    /**
     * 权限路径
     */
    @TableField(value = "PATH")
    @ApiModelProperty(value = "权限路径", required = false)
    private String path;

    /**
     * 权限图片
     */
    @TableField(value = "ICON")
    @ApiModelProperty(value = "权限图片", required = false)
    private String icon;

    /**
     * 权限分类
     */
    @TableField(value = "CATEGORY")
    @ApiModelProperty(value = "权限分类", required = false)
    private Integer category;

    /**
     * 权限排序
     */
    @TableField(value = "SORT")
    @ApiModelProperty(value = "权限排序", required = false)
    private Integer sort;

    /**
     * 权限状态
     */
    @TableField(value = "ENABLE")
    @ApiModelProperty(value = "权限状态", required = false)
    private Boolean enable;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME")
    @ApiModelProperty(value = "创建时间", required = false)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATE_TIME")
    @ApiModelProperty(value = "更新时间", required = false)
    private Date updateTime;

}
