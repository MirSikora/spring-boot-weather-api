package cz.vsb.project.controller;

import cz.vsb.project.City;
import jakarta.servlet.annotation.WebServlet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@WebServlet("/")
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("AllCities",City.values());
        return "index";
    }
}
