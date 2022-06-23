package pers.ervinse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pers.ervinse.domain.Goods;
import pers.ervinse.domain.User;

import java.util.List;

@Mapper
public interface CartMapper extends BaseMapper<Goods> {

    int insertToCart(Goods goods);

    List<Goods> selectAll();

    Goods selectByName(Goods goods);

    int deleteByName(Goods goods);

    int updateCartByName(Goods goods);
}
