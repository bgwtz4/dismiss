package org.launchcode.dismissal1.controllers;

import org.omg.CORBA.Request;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Scanner;


@Controller
@RequestMapping("early")
public class earlyController {

    @RequestMapping(value = "release")
    public String early(Model model) {
        model.addAttribute("title", "Early Pickup");
        return "early/release";
    }

    @RequestMapping(value = "earlyconfirmation")
    public String selection(Model model) {
        model.addAttribute("title", "Early Pickup Confirmation");
        return "early/earlyconfirmation";
    }
}