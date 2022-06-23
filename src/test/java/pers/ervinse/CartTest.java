package pers.ervinse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.ervinse.domain.Goods;
import pers.ervinse.mapper.CartMapper;

import java.util.List;

@SpringBootTest
public class CartTest {

    @Autowired
    CartMapper cartMapper;

    @Test
    public void testInsertCart(){
        Goods goods = new Goods();
        goods.setName("商品1");
        goods.setNumber(1);
        goods.setIsSelected(false);
        int insert = cartMapper.insertToCart(goods);
    }

    @Test
    public void testSelectAll(){
        List<Goods> goodsList = cartMapper.selectAll();
        System.out.println(goodsList);
    }

    @Test
    public void testSelectByName(){
        Goods goods = new Goods();
        goods.setName("商品1");
        Goods goodsBySelect = cartMapper.selectByName(goods);
        System.out.println(goodsBySelect);
    }

    @Test
    public void testDeleteByName(){
        Goods goods = new Goods();
        goods.setName("商品2");
        int i = cartMapper.deleteByName(goods);
    }

    @Test
    public void testUpdateCartByName(){
        Goods goods = new Goods();
        goods.setName("商品2");
        goods.setNumber(2);
        goods.setIsSelected(true);
        int i = cartMapper.updateCartByName(goods);
    }
}
