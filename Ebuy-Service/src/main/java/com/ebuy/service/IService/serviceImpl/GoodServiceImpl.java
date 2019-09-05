package com.ebuy.service.IService.serviceImpl;

import com.ebuy.domain.Goods;
import com.ebuy.mapper.GoodsMapper;
import com.ebuy.service.IService.GoodsService;
import constants.BaseApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import redis.RedisPool;
import redis.clients.jedis.Jedis;
import utils.JsonUtil;
import java.util.Map;

/**
 * @Author:lihang
 * @Description:使用redis作为缓存查询商品
 */
@Service
public class GoodServiceImpl extends BaseApiService implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private RedisPool redisPool;



    @Override
    public Map<String,Object> findGoodsById(String gid) {

        Goods goods = new Goods();
        //连接缓存
        Jedis jedis = redisPool.getJedis();
        //查询缓存
        String goodsJson = jedis.get(gid);
        if (StringUtils.isEmpty(goodsJson)){
            //将json转化为Goods对象
            goods = JsonUtil.parse(goodsJson, Goods.class);
        }else {
            //如果缓存中没有就去查询MySQL

        }
        //查询后的结果放入redis中

        //关闭
        jedis.close();
        return setResultSuccess(goods);
    }
}
