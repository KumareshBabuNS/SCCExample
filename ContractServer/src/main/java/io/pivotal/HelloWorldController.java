package io.pivotal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vupadhya on 1/12/17.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorldMethod(){
        return "Hello World";
    }
}
