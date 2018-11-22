package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author gexiao
 * @date 2018/11/22 下午 01:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductService productService;

    @Test
    public void findOne() throws Exception {
        ProductInfo result = productService.findOne("123");
        Assert.assertEquals(new String("123"),result.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = new PageRequest(0,1);
        Page<ProductInfo> pageInfo = productService.findAll(pageRequest);
        Assert.assertNotEquals(0,pageInfo);

    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1234");
        productInfo.setProductName("虾子");
        productInfo.setProductPrice(new BigDecimal("5.5"));
        productInfo.setProductStock(12);
        productInfo.setProductDescription("难吃吃");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(1);
        productInfo.setCreateTime(new Date());
        productInfo.setUpdateTime(new Date());

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

}