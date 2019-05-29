package com.oscar.cloudfeign.WebController;

import com.oscar.cloudfeign.Client.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @RequestMapping(value="hi", method = RequestMethod.GET)
    public String sayhi(@RequestParam("name") String name){
        return hiService.sayHiFromClient(name);
    }

}
