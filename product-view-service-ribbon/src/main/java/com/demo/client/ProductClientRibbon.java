package com.demo.client;

import java.util.List;

import com.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon 客户端， 通过 restTemplate 访问 http://PRODUCT-DATA-SERVICE/products ，
 * 而 product-data-service 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称。
 */

@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }

}