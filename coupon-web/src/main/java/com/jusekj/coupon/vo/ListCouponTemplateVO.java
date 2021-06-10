package com.jusekj.coupon.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @description 优惠卷列表查询VO
 * @author: LFP
 * @create: 2021-06-10 10:20
 **/
@ApiModel("优惠卷列表查询VO")
@Data
public class ListCouponTemplateVO {
    @ApiModelProperty(value = "模板名称/ID")
    private String templateIdOrName;

    @ApiModelProperty(value = "模板名称/ID")
    private String templateIdOrName;
}
