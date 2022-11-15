package pers.ervinse.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.ervinse.domain.Goods;
import pers.ervinse.service.GoodsService;

import java.util.List;

/**
 * 商品
 */
@Slf4j
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    /**
     * 获取所有商品
     * @return
     */
    @GetMapping
    public List<Goods> getAll(){
        log.info("getAllGoods");
        return goodsService.getAll();
    }

    /**
     * 获取热点商品
     * @return
     */
    @GetMapping("/getHotGoods")
    public List<Goods> getHotGoods(){
        log.info("getHotGoods");
        return goodsService.getHotGoods();
    }
}
