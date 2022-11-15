package pers.ervinse.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.ervinse.domain.Goods;
import pers.ervinse.mapper.CartMapper;
import pers.ervinse.service.CartService;

import java.util.List;

@Slf4j
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper cartMapper;

    @Override
    public int addGoodsToCart(Goods goods) {

        log.info("addGoodsToCart :" + goods);
        goods.setNumber(1);

        Goods goodsBySelect = cartMapper.selectByName(goods);
        if (goodsBySelect == null) {
            return cartMapper.insertToCart(goods);
        }else {
            return 0;
        }
    }

    @Override
    public List<Goods> getAll() {
        log.info("getAll");

        return cartMapper.selectAll();
    }

    @Override
    public int deleteByName(Goods goods){
        log.info("deleteByName" + goods);
        return cartMapper.deleteByName(goods);
    }

    @Override
    public int updateGoodsInfo(List<Goods> goodsList){
        log.info("updateGoodsInfo" + goodsList);
        int affectRows = 0;
        for (Goods goods : goodsList) {
            affectRows += cartMapper.updateCartByName(goods);
        }
        return affectRows;
    }

}
