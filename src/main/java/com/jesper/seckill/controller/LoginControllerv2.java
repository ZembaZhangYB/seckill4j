/**
 * Created by Zemba On 2026/2/26
 */
package com.jesper.seckill.controller;

import com.jesper.seckill.result.Result;
import com.jesper.seckill.service.UserService;
import com.jesper.seckill.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v2/login")
public class LoginControllerv2 {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result<String> login(HttpServletResponse response, @Valid LoginVo loginVo){
        String token = userService.login(response, loginVo);
        return Result.success(token);
    }
}
