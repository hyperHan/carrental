package top.pitaya.carrental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoEntity implements Serializable {
    private Long idUserInfo;
    private String userName;
    private String password;
}
