package board.controller;

import board.annotation.Controller;
import board.annotation.mapping.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = "/")
    public String toMain() {
        return "/main";
    }

}