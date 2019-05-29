package com.oscar.cloudfeign.Client.fallback;

import com.oscar.cloudfeign.Client.HiService;
import org.springframework.stereotype.Component;

@Component
public class FallbackHystrix implements HiService {
    @Override
    public String sayHiFromClient(String name) {
        return "error";
    }
}
