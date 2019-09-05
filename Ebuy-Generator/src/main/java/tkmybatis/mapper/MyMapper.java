package tkmybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
