package com.znlccy.common.model;

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
public class Land implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 8804498457470135190L;

    /**
     * 土地主键
     */
    @ApiModelProperty(value = "土地主键", required = false)
    private Long id;

    /**
     * 土地地址
     */
    @ApiModelProperty(value = "土地地址", required = false)
    private String location;

    /**
     * 土地面积
     */
    @ApiModelProperty(value = "土地面积", required = false)
    private BigDecimal area;

    /**
     * 土地租金
     */
    @ApiModelProperty(value = "土地租金", required = false)
    private BigDecimal rentAmount;

    /**
     * 土地租用日期
     */
    @ApiModelProperty(value = "土地租用日期", required = false)
    private Date rentDate;

    /**
     * 土地租用有效期
     */
    @ApiModelProperty(value = "土地租用有效期", required = false)
    private Date rentValidate;

    /**
     * 土地拥有者
     */
    @ApiModelProperty(value = "土地拥有者", required = false)
    private Long owner;

    /**
     * 土地承包者
     */
    @ApiModelProperty(value = "土地承包者", required = false)
    private Long contractor;

    /**
     * 土地合同
     */
    @ApiModelProperty(value = "土地合同", required = false)
    private Long contract;

    /**
     * 创建时间
     */

    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
