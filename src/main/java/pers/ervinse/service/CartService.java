package pers.ervinse.service;


import pers.ervinse.domain.Goods;

import java.util.List;

public interface CartService {

    int addGoodsToCart(Goods goods);

    List<Goods> getAll();

    int deleteByName(Goods goods);

    int updateGoodsInfo(List<Goods> goodsList);
}
