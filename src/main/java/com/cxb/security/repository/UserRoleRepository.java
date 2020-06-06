package com.cxb.security.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cxb.security.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleRepository extends BaseMapper<UserRole> {
}
