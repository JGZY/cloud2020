package com.wj.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wen.jie
 * @Classname MyRuleConfig
 * @Description TODO
 * @Date 2020/9/5
 */
@Configuration
public class MyRuleConfig {

    @Bean
    public IRule iRule(){
        return new RandomRule();//随机规则
    }

}
