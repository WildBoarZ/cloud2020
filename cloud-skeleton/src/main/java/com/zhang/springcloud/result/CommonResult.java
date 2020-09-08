package com.zhang.springcloud.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : CommonResult
 * @Description : 通用返回类
 * @since: 1.14.1
 * @Author : zhanglei
 * @Date: 2020-09-03 19:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }

    public void setResult(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
