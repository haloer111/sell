package com.imooc.repository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author gexiao
 * @date 2018/11/22 下午 12:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal("3.5"));
        productInfo.setProductStock(12);
        productInfo.setProductDescription("好吃");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(1);
        productInfo.setCreateTime(new Date());
        productInfo.setUpdateTime(new Date());


        ProductInfo result = productInfoRepository.save(productInfo);

        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatusIn() throws Exception {
        List<ProductInfo> result = productInfoRepository.findByProductStatusIn(0);
        Assert.assertNotEquals(0,result);

    }

}