package com.gulimall.member.dao;

import com.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author loophong
 * @email 1940155085@qq.com
 * @date 2024-01-24 16:34:33
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
