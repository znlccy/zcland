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

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ClassName: Order
 * FileName：Order.java
 * Description：订单实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 1.0				znlccy		    2019-12-31 21:52		create
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Order", description = "订单实体类")
@TableName(value = "tb_order")
public class Order extends Model<Order> implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -4115138458546012505L;

    /**
     * 订单主键
     */
    @TableId(value = "ID")
    @ApiModelProperty(value = "订单主键", required = false)
    private Long id;

    /**
     * 订单单价
     */
    @TableField(value = "PRICE")
    @ApiModelProperty(value = "订单单价", required = false)
    private BigDecimal price;

    /**
     * 订单数量
     */
    private Integer number;

    /**
     * 订单商品
     */
    private Long goodsId;
}
