package com.jesper.seckill.controller;

import com.jesper.seckill.bean.User;
import com.jesper.seckill.result.Result;
import com.jesper.seckill.service.GoodsServicev2;
import com.jesper.seckill.vo.GoodsDetailVo;
import com.jesper.seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/goods")
public class GoodsControllerv2 {
    @Autowired
    private GoodsServicev2 goodsService;

    @GetMapping("/list")
    public Result<List<GoodsVo>> list() {
        return Result.success(goodsService.listGoodsVo());
    }

    @GetMapping("/details/{goodsId}")
    public Result<GoodsDetailVo> showGoodDetail(@PathVariable Long goodsId, User user) {
        return Result.success(goodsService.getGoodsDetailVoByGoodsId(goodsId, user));
    }
}
