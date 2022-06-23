package pers.ervinse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pers.ervinse.domain.Goods;

import java.util.List;

@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

    List<Goods> selectAll();

    List<Goods> selectHotGoods();
}
