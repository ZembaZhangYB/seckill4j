package com.jesper.seckill.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created by jiangyunxiong on 2018/5/22.
 * Modified by Zemba on 2026/2/26.
 */
@Data
public class User {
    private Long id;
    private String nickname;
    private String password;
    private String salt;
    private String head;
    private Date registerDate;
    private Date lastLoginDate;
    private Integer loginCount;
}
