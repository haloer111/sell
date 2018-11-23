package com.imooc.repository;

import java.math.BigDecimal;
import java.util.Date;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author gexiao
 * @date 2018/11/23 下午 02:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void save() throws Exception {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123");
        orderMaster.setBuyerName("老王");
        orderMaster.setBuyerPhone("17759671345");
        orderMaster.setBuyerAddress("南宁市七星路");
        orderMaster.setBuyerOpenid("1");
        orderMaster.setOrderAmount(new BigDecimal("30"));
        orderMaster.setOrderStatus(0);
        orderMaster.setPayStatus(0);
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {

        PageRequest page = new PageRequest(0,1);
        Page<OrderMaster> byBuyerOpenid = orderMasterRepository.findByBuyerOpenid("1", page);
        Assert.assertNotNull(byBuyerOpenid);

    }

}