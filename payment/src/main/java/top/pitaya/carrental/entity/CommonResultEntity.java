package top.pitaya.carrental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResultEntity<T> {
    private String code;
    private String message;
    private T data;

    /**
     * T是各个模块返回的entity,当T为空时调用以下方法
     *
     * @param code
     * @param message
     */
    public CommonResultEntity(String code, String message) {
        this(code, code, null);
    }
}
