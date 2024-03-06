package com.kk.controller;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date:2024/2/28
 * @Author：luckyxxk Description:
 */

@RestController
public class ReduceStockController {

    @Autowired
    private RedissonClient redisson;

    @Transactional
    public int reduceStock() {
        //先查询缓存
        //缓存没有，查询数据库
        return 0;
    }

}
