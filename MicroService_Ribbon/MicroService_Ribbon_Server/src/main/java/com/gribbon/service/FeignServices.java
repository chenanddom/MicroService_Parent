package com.gribbon.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chendom
 * @date 2017/11/30 10:34
 */
public interface FeignServices {
    @RequestMapping("/provider/getConfigure")
    public String getConfig();

}
