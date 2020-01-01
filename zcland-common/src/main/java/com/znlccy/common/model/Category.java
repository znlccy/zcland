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
 * ClassName: Category
 * FileName：Category.java
 * Description：分类实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-30 09:18		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "Category", description = "分类实体类")
@TableName(value = "TB_CATEGORY")
public class Category extends Model<Category> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -5751904386890440131L;

    /**
     * 分类主键
     */
    @TableId(value = "ID")
    @ApiModelProperty(value = "分类主键", required = false)
    private Long id;

    /**
     * 分类名称
     */
    @TableField(value = "NAME")
    @ApiModelProperty(value = "分类名称", required = false)
    private String name;

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
