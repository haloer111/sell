package com.imooc.service.impl;
import java.util.Date;

import com.imooc.dataobject.ProductCategory;
import com.imooc.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author gexiao
 * @date 2018/11/22 上午 11:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
     private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(111),productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(1, 23, 4, 5));
        Assert.assertNotEquals(0,productCategoryList.size());

    }

    @Test
    @Transactional
    @Rollback(true)
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("test2");
        productCategory.setCategoryType(3);

        ProductCategory result = categoryService.save(productCategory);

        Assert.assertNotNull(result);
    }

}