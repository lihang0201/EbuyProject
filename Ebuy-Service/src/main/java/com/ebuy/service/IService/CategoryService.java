package com.ebuy.service.IService;

import com.ebuy.domain.Category;

import java.util.List;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
public interface CategoryService {
    List<Category> findCategoryById(String id);
}
