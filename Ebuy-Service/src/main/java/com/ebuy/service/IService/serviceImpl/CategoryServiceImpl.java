package com.ebuy.service.IService.serviceImpl;

import com.ebuy.domain.Category;
import com.ebuy.mapper.CategoryMapper;
import com.ebuy.service.IService.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findCategoryById(String id) {

        return null;
    }
}
