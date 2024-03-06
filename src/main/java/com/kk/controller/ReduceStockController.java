package com.kk.controller;

import org.redisson.api.RLock;
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
        RLock rLock = redisson.getLock("分布式锁");
        rLock.lock();
        try {
            //先查询缓存
            //缓存没有，查询数据库
        }  finally {
            rLock.unlock();
        }
        return 0;
    }

}
