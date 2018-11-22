package com.imooc.controller;

import com.imooc.vo.ResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 买家商品
 * @author gexiao
 * @date 2018/11/22 下午 05:41
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVo list(){
        ResultVo resultVo = new ResultVo();
        return resultVo;
    }
}
