package au.com.riosoftware.firstapp.controller;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sniper on 12/11/2016.
 */
@Controller
@RequestMapping("/posts")
public class PostController {
    // TODO: Something show a list of posts!

    @RequestMapping(value="", method= RequestMethod.GET )
    public String listPost(Model model){
        return "posts/list";
    }
}
