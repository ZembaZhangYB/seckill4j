package com.jesper.seckill.controller;

import com.jesper.seckill.service.SeckillServicev2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/seckill")
public class SeckillControllerv2 {
    @Autowired
    private SeckillServicev2 seckillService;

}
