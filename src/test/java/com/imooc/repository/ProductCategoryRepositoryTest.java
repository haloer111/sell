package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author gexiao
 * @date 2018/11/22 上午 09:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class ProductCategoryRepositoryTest {

    @Autowired
   private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory categoryRepositor = productCategoryRepository.findById(1).get();
        System.out.println(categoryRepositor.toString());
    }

    @Test
    public void add(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱test");
        productCategory.setCategoryType(5);
        productCategoryRepository.save(productCategory);

    }
    @Test
    @Transactional
    public void update(){
        ProductCategory productCategory = productCategoryRepository.findById(9).get();

        productCategory.setCategoryName("女生最爱test4");
        ProductCategory save = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(save);

    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> categoryTypeList = Arrays.asList(1,2);
        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
        Assert.assertEquals(3,result.size());
    }
}