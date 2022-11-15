package pers.ervinse.service;

import pers.ervinse.domain.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> getAll();

    List<Goods> getHotGoods();
}
