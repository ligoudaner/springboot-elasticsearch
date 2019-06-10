package com.sven.elasticsearch.goods.repository;

import com.sven.elasticsearch.goods.index.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
    /**
     * @Description: 根据价格区间查询
     * @Author:     xiangwei
     * @CreateDate: 2019/6/10 14:44
     * @param price1
     * @param price2
     * @return      java.util.List<com.sven.elasticsearch.goods.index.Item>
     */
    List<Item> findByPriceBetween(double price1, double price2);

}
