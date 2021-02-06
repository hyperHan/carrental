package top.pitaya.carrental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.pitaya.carrental.dao.UserInfoDao;
import top.pitaya.carrental.entity.UserInfoEntity;
import top.pitaya.carrental.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfoEntity getUserInfo(Long id) {
        return userInfoDao.getUserInfo(id);
    }

    @Override
    public int create(UserInfoEntity userInfoEntity) {
        return userInfoDao.create(userInfoEntity);
    }
}
