package com.demo.service;

import java.util.List;

import com.demo.client.ProductClientRibbon;
import com.demo.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();

    }
}