package com.jesper.seckill.controller;

import com.jesper.seckill.bean.User;
import com.jesper.seckill.result.Result;
import com.jesper.seckill.service.OrderServicev2;
import com.jesper.seckill.vo.OrderDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/order")
public class OrderControllerv2 {
    @Autowired
    private OrderServicev2 orderService;

    @GetMapping("/detail")
    public Result<OrderDetailVo> getDetail(Long orderId, User user) {
        return Result.success(orderService.getDetail(orderId, user));
    }
}
