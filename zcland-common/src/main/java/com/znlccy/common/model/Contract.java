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
 * ClassName: Contract
 * FileName：Contract.java
 * Description：合同实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2020-01-01 12:16		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "Contract", description = "合同实体类")
@TableName(value = "TB_CONTRACT")
public class Contract extends Model<Contract> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -7580486551916898399L;

    /**
     * 合同主键
     */
    @TableId(value = "ID")
    @ApiModelProperty(value = "合同主键")
    private Long id;

    /**
     * 合同标题
     */
    @TableField(value = "TITLE")
    @ApiModelProperty(value = "合同标题", required = false)
    private String title;

    /**
     * 合同内容
     */
    @TableField(value = "CONTENT")
    @ApiModelProperty(value = "合同内容", required = false)
    private String content;

    /**
     * 合同描述
     */
    private String description;

    /**
     * 合同状态
     */
    private Boolean enable;

    /**
     * 合同有效期
     */
    private Date invalidDate;

    /**
     * 合同开始期
     */
    private Date beginDate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
