package com.deliveryjumper.vo;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 * Project : delivery-jumper
 * Created by gonuu
 * Date : 2021-08-12
 * Time : 오전 11:56
 * Blog : http://devonuu.tistory.com
 * Github : http://github.com/devonuu
 */

@Data
@Builder
public class DeliveryItemInfo implements Serializable {
    private String title;
    private int orderItemQuantity;
    private double orderItemPrice;
}
