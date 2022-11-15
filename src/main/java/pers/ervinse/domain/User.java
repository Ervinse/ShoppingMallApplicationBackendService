package pers.ervinse.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//为当前实体类在编译期设置对应的get/set方法，toString方法，hashCode方法，equals方法等
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")//定的数据库表和 JavaBean 进⾏映射
public class User {
    @TableId()
    private String name;
    private String password, description;


}
