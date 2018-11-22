package com.imooc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author gexiao
 * @date 2018/11/22 下午 12:54
 */
@Getter
public enum ProductStatusEnum {
    /**
     * 0-在售
     */
    UP(0,"在售"),
    /**
     * 1-下架
     */
    DOWN(1,"下架");
    private Integer code;
    private String  msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
