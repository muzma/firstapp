package au.com.riosoftware.firstapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sniper on 12/11/2016.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
}
