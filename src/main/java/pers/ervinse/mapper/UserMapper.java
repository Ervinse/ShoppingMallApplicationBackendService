package pers.ervinse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pers.ervinse.domain.User;

import java.util.List;


@Mapper
public interface UserMapper extends BaseMapper<User> {


}
