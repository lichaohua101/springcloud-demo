package com.demo.client;

import java.util.List;

import com.demo.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign 客户端， 通过 注解方式 访问 访问PRODUCT-DATA-SERVICE服务的 products路径，
 * product-data-service 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称。
 */
//这就表示，如果访问的 PRODUCT-DATA-SERVICE 不可用的话，就调用 ProductClientFeignHystrix 来进行反馈信息。
@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

    @GetMapping("/products")
    public List<Product> listProdcuts();
}