package com.library.ensaf.server.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/espaceClient")
    public String aboutPage() {
        return "espaceClient"; 

    
    

    }
    /*@GetMapping("/Admin")
    public String BorrowPage() {
        return "Admin"; 


    }
  */
}
