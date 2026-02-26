package com.jesper.seckill.bean;

import lombok.Data;

/**
 * Created by jiangyunxiong on 2018/5/22.
 * Modified by Zemba on 2026/2/26.
 */
@Data
public class SeckillOrder {
    private Long id;
    private Long userId;
    private Long  orderId;
    private Long goodsId;
}
