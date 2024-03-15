package uniandes.edu.co.parranderos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BancAndesController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
