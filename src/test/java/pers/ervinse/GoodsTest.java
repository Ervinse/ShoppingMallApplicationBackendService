package pers.ervinse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.ervinse.domain.Goods;
import pers.ervinse.mapper.GoodsMapper;

import java.util.List;

@SpringBootTest
public class GoodsTest {

    @Autowired
    GoodsMapper goodsMapper;

    @Test
    public void testSelectAll(){

        List<Goods> goodsList = goodsMapper.selectAll();
        System.out.println(goodsList);
    }

    @Test
    public void testSelectHotGoods(){

        List<Goods> goodsList = goodsMapper.selectHotGoods();
        System.out.println(goodsList);
    }
}
