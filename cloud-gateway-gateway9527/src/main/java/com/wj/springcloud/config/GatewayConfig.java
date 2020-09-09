package com.wj.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wen.jie
 * @Classname GatewayConfig
 * @Description TODO
 * @Date 2020/9/6
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_wj",r->{
            //意思是访问localhost:9527/guonei，将会转发到http://news.baidu.com/guonei
                    return r.path("/guonei").uri("http://news.baidu.com/guonei");
        }).build();
        return routes.build();
    }
}
