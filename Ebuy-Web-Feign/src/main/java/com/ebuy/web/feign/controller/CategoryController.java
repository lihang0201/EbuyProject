package com.ebuy.web.feign.controller;

import com.ebuy.domain.Category;
import com.ebuy.service.IService.serviceImpl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryService;

    /**
     * 根据分类id查询商品id
     * @param cid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> findCategoryById(@RequestParam("cid") String cid){
        return ResponseEntity.ok(categoryService.findCategoryById(cid));
    }


}
