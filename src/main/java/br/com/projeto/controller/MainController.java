package br.com.projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by helenapenha on 29/06/17.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String greeting(){
        return "Hello World!!";
    }
}
