package com.ls;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by pkls on 2018-04-24.
 */
@FeignClient(value="service-hi", fallback = SchedualServiceHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
