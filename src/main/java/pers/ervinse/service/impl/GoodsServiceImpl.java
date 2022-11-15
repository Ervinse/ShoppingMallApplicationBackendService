package pers.ervinse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.ervinse.domain.Goods;
import pers.ervinse.mapper.GoodsMapper;
import pers.ervinse.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> getAll(){
        return goodsMapper.selectAll();
    }

    @Override
    public List<Goods> getHotGoods(){
        return goodsMapper.selectHotGoods();
    }
}
