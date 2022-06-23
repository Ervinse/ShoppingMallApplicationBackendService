package pers.ervinse;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.ervinse.domain.User;
import pers.ervinse.mapper.UserMapper;

@SpringBootTest
public class UserTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelectByName(){

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "AA");
        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    public void testSelectByNameAndPassword(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "AA");
        wrapper.eq("password", "12345");
        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    @Test
    public void testInsert(){

        User user = new User("BB", "123456", "BB测试账号");
        int affectRows = userMapper.insert(user);
        System.out.println("更新成功,影响了" + affectRows + "行数据");
    }
}
