package top.pitaya.carrental.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.pitaya.carrental.entity.UserInfoEntity;

@Mapper
public interface UserInfoDao {
    UserInfoEntity getUserInfo(@Param("id") Long id);

    int create(UserInfoEntity userInfoEntity);
}
