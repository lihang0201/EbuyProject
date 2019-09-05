package com.ebuy.service.IService.serviceImpl;

import com.ebuy.domain.BsUser;
import com.ebuy.service.IService.UserService;
import constants.BaseApiService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import utils.MD5Util;
import utils.UUIDUtil;

import java.util.Map;

/**
 * @Author:lihang
 * @Description:使用MD5加密方法保存用户密码
 * @param:
 * @return:
 */
@Service
public class UserServiceImpl extends BaseApiService implements UserService {

    @Override
    public Map<String,Object> regist(BsUser user) {
        if (StringUtils.isEmpty(user.getUsername())){
            return setResultError("用户名不能为空");
        }else {
            if (StringUtils.isEmpty(user.getPassword())){
                return setResultError("密码不能为空");
            }else {
                BsUser bsUser = new BsUser();
                bsUser.setUid(UUIDUtil.randomUUID());
                bsUser.setUsername(user.getUsername());
                bsUser.setPassword(MD5Util.MD5(user.getPassword()));
                return setResultSuccess(bsUser);
            }
        }
    }
}
