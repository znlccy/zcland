package com.znlccy.common.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

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
public class Category implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -5751904386890440131L;

    /**
     *
     */
    private Long id;
}
