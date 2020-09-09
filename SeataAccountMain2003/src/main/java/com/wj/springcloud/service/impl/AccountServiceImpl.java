package com.wj.springcloud.service.impl;

import com.wj.springcloud.dao.AccountDao;
import com.wj.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author wen.jie
 * @Classname OrderServiceImpl
 * @Description TODO
 * @Date 2020/9/9
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("---> AccountService中扣减账户余额");
        accountDao.decrease(userId, money);
        log.info("---> AccountService中扣减账户余额完成");
    }
}
