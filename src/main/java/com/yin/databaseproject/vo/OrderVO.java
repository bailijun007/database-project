package com.yin.databaseproject.vo;

import lombok.Data;

import java.util.List;

/**
 * @author yin
 * @Date 2019/9/14 11:05
 * @Method
 */
@Data
public class OrderVO {
    private Long  id;
    private String orderName;
    private String orderUser;
    private Long created;

    @Override
    public String toString() {
        return "OrderVO{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", orderUser='" + orderUser + '\'' +
                ", created=" + created +
                '}';
    }
}
