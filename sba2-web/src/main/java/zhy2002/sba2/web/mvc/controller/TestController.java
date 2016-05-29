package zhy2002.sba2.web.mvc.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * A controller used for testing purpose.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String home() {
        return "Spring Boot says hello!";
    }

    @RequestMapping("/data")
    public Object home2() {
        String[] array = {"value1", "value2"};
        return array;
    }

    @RequestMapping("/params")
    public Object param(@RequestBody Map<String, Object> params) {
        return new Object[] {"result is:", params};
    }
}
