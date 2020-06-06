package com.cxb.security.repository;

        import com.baomidou.mybatisplus.core.mapper.BaseMapper;
        import com.cxb.security.entity.User;
        import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository extends BaseMapper<User> {
}
