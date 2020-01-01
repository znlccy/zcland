package com.znlccy.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: Goods
 * FileName：Goods.java
 * Description：商品实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-30 09:11		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "Goods", description = "商品实体类")
@TableName(value = "tb_goods")
public class Goods extends Model<Goods> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = 8183926737912484621L;

    /**
     * 商品主键
     */
    @ApiModelProperty(value = "商品主键", required = false)
    private Long id;

    /**
     * 商品标题
     */
    @ApiModelProperty(value = "商品标题", required = false)
    private String title;

    /**
     * 商品描述
     */
    @ApiModelProperty(value = "商品描述", required = false)
    private String description;

    /**
     * 商品单价
     */
    @ApiModelProperty(value = "商品单价", required = false)
    private BigDecimal price;

    /**
     * 商品有效期
     */
    @ApiModelProperty(value = "商品有效期", required = false)
    private Date validateDate;

    /**
     * 商品地址
     */
    @ApiModelProperty(value = "商品地址", required = false)
    private String address;

    /**
     * 商品编码
     */
    @ApiModelProperty(value = "商品编码", required = false)
    private String code;

    /**
     * 商品图片
     */
    @ApiModelProperty(value = "商品图片", required = false)
    private String picture;

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
