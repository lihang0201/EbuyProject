package com.ebuy.service.IService;

import com.ebuy.domain.BsUser;

import java.util.Map;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
public interface UserService {
    Map<String,Object> regist(BsUser user);
}
