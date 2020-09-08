package com.zhang.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName : Payment
 * @Description :
 * @since: 1.14.1
 * @Author : zhanglei
 * @Date: 2020-09-02 20:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private static final long serialVersionUID = 5834596757359894889L;

    private Long id;
    private String serial;
}
