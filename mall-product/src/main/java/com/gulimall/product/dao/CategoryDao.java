package com.gulimall.product.dao;

import com.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author loophong
 * @email 1940155085@qq.com
 * @date 2024-01-23 19:59:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
