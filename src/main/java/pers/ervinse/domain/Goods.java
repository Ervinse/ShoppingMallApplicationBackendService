package pers.ervinse.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 商品实体类
 */
@Data//为当前实体类在编译期设置对应的get/set方法，toString方法，hashCode方法，equals方法等
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {

    private String name, description,location,image;
    private int number;
    private double price;
    public Boolean isSelected = false;

    public Goods(String name, String description, double price, String location) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.price = price;
    }
}
