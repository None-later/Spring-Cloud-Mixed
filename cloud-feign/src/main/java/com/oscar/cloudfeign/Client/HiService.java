package com.oscar.cloudfeign.Client;

import com.oscar.cloudfeign.Client.fallback.FallbackHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value ="client1", fallback = FallbackHystrix.class)
public interface HiService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name") String name);
}
