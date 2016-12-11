package au.com.riosoftware.firstapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sniper on 12/11/2016.
 */
@RestController
public class RestControllerTest {

    @RequestMapping("/test")
    public String test(){
        return "Testing";
    }
}
