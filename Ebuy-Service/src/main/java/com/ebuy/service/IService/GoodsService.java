package com.ebuy.service.IService;

import java.util.Map;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
public interface GoodsService {
    Map<String,Object> findGoodsById(String gid);
}
