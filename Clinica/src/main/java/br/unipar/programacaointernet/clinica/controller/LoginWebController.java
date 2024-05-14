package br.unipar.programacaointernet.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginWebController {

    @GetMapping("/hello~world")
    public String helloWorld(@RequestParam(value = "name",defaultValue = "World") String name){
        return "Hello " + name + "!";
    }
    @GetMapping("/login")
    public String loginForm(){
        return "login";//Retorna a pagina de login(login.html)
    }
}
