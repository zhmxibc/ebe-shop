package com.sxquan.core.pojo.order;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 订单商品详情表
 * </p>
 *
 * @author sxquan
 * @since 2020-05-12
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@TableName("order_item")
@ApiModel(value="OrderItem对象", description="订单商品详情表")
public class OrderItem implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "订单ID")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty(value = "商品sku_id")
    @TableField("sku_id")
    private Long skuId;

    @ApiModelProperty(value = "规格信息")
    @TableField("spec_info")
    private String specInfo;

    @ApiModelProperty(value = "商品标题")
    @TableField("title")
    private String title;

    @ApiModelProperty(value = "商品封面")
    @TableField("cover")
    private String cover;

    @ApiModelProperty(value = "价")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty(value = "总价")
    @TableField("total_price")
    private BigDecimal totalPrice;

    @ApiModelProperty(value = "下单数量")
    @TableField("amount")
    private Integer amount;


}
