package com.gulimall.order.dao;

import com.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author loophong
 * @email 1940155085@qq.com
 * @date 2024-01-24 16:42:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
