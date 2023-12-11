package ${package}.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ${project-name}Controller {


    @GetMapping("/")
    public String getGreetings() {
        return "Hello, world";
    }
}
