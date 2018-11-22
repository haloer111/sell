package com.imooc.vo;

import lombok.Data;

/**
 * @author gexiao
 * @date 2018/11/22 下午 05:46
 */
@Data
public class ResultVo<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
