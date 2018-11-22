package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @author gexiao
 * @date 2018/11/22 上午 11:30
 */
public interface CategoryService {

    /*manager start */
    ProductCategory findOne(Integer catogoryId);

    List<ProductCategory> findAll();





    /*manager end */





    /*portal start*/
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save (ProductCategory productCategory);




    /*portal end*/

}
