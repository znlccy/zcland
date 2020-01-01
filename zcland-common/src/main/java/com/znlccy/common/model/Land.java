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
import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: Land
 * FileName：Land.java
 * Description：土地实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-30 09:06		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "Land", description = "土地实体类")
@TableName(value = "TB_LAND")
public class Land extends Model<Land> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 8804498457470135190L;

    /**
     * 土地主键
     */
    @TableId(value = "ID")
    @ApiModelProperty(value = "土地主键", required = false)
    private Long id;

    /**
     * 土地地址
     */
    @TableField(value = "LOCATION", exist = true)
    @ApiModelProperty(value = "土地地址", required = false)
    private String location;

    /**
     * 土地面积
     */
    @TableField(value = "AREA")
    @ApiModelProperty(value = "土地面积", required = false)
    private BigDecimal area;

    /**
     * 土地租金
     */
    @TableField(value = "RENT_AMOUNT")
    @ApiModelProperty(value = "土地租金", required = false)
    private BigDecimal rentAmount;

    /**
     * 土地租用日期
     */
    @TableField(value = "RENT_DATE")
    @ApiModelProperty(value = "土地租用日期", required = false)
    private Date rentDate;

    /**
     * 土地租用有效期
     */
    @TableField(value = "RENT_VALIDATE")
    @ApiModelProperty(value = "土地租用有效期", required = false)
    private Date rentValidate;

    /**
     * 土地拥有者
     */
    @TableField(value = "OWNER")
    @ApiModelProperty(value = "土地拥有者", required = false)
    private Long owner;

    /**
     * 土地承包者
     */
    @TableField(value = "CONTRACTOR")
    @ApiModelProperty(value = "土地承包者", required = false)
    private Long contractor;

    /**
     * 土地合同
     */
    @TableField(value = "CONTRACT")
    @ApiModelProperty(value = "土地合同", required = false)
    private Long contract;

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
