package lab.aikibo.testci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/halo")
    public String halo(@RequestParam(name="name", required=false, defaultValue = "dunia") String name, Model model) {
        model.addAttribute("name", name);
        return "halo";
    }

}
