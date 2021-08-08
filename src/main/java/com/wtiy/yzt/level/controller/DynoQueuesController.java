package com.wtiy.yzt.level.controller;

import com.wtiy.yzt.level.model.BaseIn;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangyu
 * @Create: 2021/7/7 3:36 下午
 * @Description:
 */
@RestController
@RequestMapping("queues")
public class DynoQueuesController {

    /**
     *
     *
     * @param baseIn
     * @return
     */
    @PostMapping(value = "/list")
    public String allInfo(@RequestBody BaseIn baseIn) {
        return "done";
    }
}
