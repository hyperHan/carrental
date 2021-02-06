package top.pitaya.carrental.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import top.pitaya.carrental.entity.CommonResultEntity;
import top.pitaya.carrental.entity.UserInfoEntity;
import top.pitaya.carrental.service.UserInfoService;

@RestController
@Slf4j
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/user/{id}")
    public CommonResultEntity<UserInfoEntity> login(@PathVariable Long id) {
        UserInfoEntity userInfoEntity = userInfoService.getUserInfo(id);

        if (userInfoEntity != null) {
            return new CommonResultEntity("200", "查询成功,serverPort:  " + serverPort, userInfoEntity);
        } else {
            return new CommonResultEntity("444", "没有对应记录,查询ID: " + id, null);
        }
    }

    @PostMapping(value = "/user/create")
    public CommonResultEntity create(@RequestBody UserInfoEntity userInfoEntity) {
        int result = userInfoService.create(userInfoEntity);
        log.info("*****插入结果：" + result);

        if (result > 0) {
            return new CommonResultEntity("200", "插入数据库成功,serverPort: " + serverPort, result);
        } else {
            return new CommonResultEntity("444", "插入数据库失败", null);
        }
    }

}
