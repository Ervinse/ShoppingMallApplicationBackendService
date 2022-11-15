package pers.ervinse.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.ervinse.domain.Goods;
import pers.ervinse.service.CartService;

import java.util.List;

/**
 * 购物车
 */
@Slf4j
@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/addGoodsToCart")
    public boolean addGoodsToCart(@RequestBody Goods goods) {
        log.info("addGoodsToCart" + goods);

        int affectRows = cartService.addGoodsToCart(goods);
        if (affectRows > 0) {
            log.info("商品插入成功,影响了" + affectRows + "行数据");
            return true;
        } else {
            log.info("商品插入失败,影响了" + affectRows + "行数据");
            return false;
        }
    }

    @GetMapping
    public List<Goods> getAll() {
        log.info("getAll");
        List<Goods> goodsList = cartService.getAll();
        log.info("获取数据:" + goodsList);
        return goodsList;
    }

    @PostMapping("/deleteByName")
    public boolean deleteByName(@RequestBody Goods goods) {
        log.info("deleteByName:" + goods);

        int affectRows = cartService.deleteByName(goods);
        if (affectRows > 0) {
            log.info("商品删除成功,影响了" + affectRows + "行数据");
            return true;
        }else {
            log.info("商品删除失败,影响了" + affectRows + "行数据");
            return false;
        }
    }

    @PostMapping("/updateGoodsInfo")
    public boolean updateGoodsInfo(@RequestBody List<Goods> goodsList){
        log.info("updateGoodsInfo" + goodsList);
        int affectRows = cartService.updateGoodsInfo(goodsList);
        log.info("修改购物车信息成功,影响了" + affectRows + "行数据");
        return true;
    }
}
