package com.cxb.security.repository;

        import com.baomidou.mybatisplus.core.mapper.BaseMapper;
        import com.cxb.security.entity.Role;
        import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleRepository extends BaseMapper<Role> {
}
