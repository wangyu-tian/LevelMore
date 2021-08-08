package com.wtiy.yzt.level.model;

import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author wangyu
 */
@Data
@Accessors(chain = true)
public class BaseIn<T> {


    private T data;
}
