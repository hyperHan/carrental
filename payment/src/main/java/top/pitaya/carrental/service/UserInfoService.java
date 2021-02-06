package top.pitaya.carrental.service;

import top.pitaya.carrental.entity.UserInfoEntity;


public interface UserInfoService {
    UserInfoEntity getUserInfo(Long id);

    int create(UserInfoEntity userInfoEntity);
}
