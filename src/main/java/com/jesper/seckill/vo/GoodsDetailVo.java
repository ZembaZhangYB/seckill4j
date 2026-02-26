package com.jesper.seckill.vo;

import com.jesper.seckill.bean.User;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jiangyunxiong on 2018/5/24.
 * Modified by Zemba on 2026/2/26.
 */
@Data
@NoArgsConstructor
public class GoodsDetailVo {
    private int seckillStatus = 0;
    private int remainSeconds = 0;
    private GoodsVo goods;
    private User user;

    public static GoodsDetailVo of(GoodsVo goods, User user) {
        GoodsDetailVo goodsDetailVo = new GoodsDetailVo();
        goodsDetailVo.setGoods(goods);
        goodsDetailVo.setUser(user);
        return goodsDetailVo;
    }

}
