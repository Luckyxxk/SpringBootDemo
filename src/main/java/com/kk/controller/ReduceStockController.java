package com.kk.controller;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date:2024/2/28
 * @Author：luckyxxk Description:
 */

@RestController
public class ReduceStockController {

    @Autowired
    private RedissonClient redissonClient;



    public static void main(String[] args) {

    }

}
