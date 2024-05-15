package br.unipar.programacaointernet.clinica.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    @GetMapping("/bemvindo")
    public String bemvindo(){
        return "bemvindo";
    }
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, Model model){
        if(username.equals("Lucius") && password.equals("123")){
            //se nosso usuario tiver válido
            session.setAttribute("usuarioLogado",username);
            return "redirect:/bemvindo";
        }else{
            model.addAttribute("erro","Usuario ou senha inválidos");
            return username;
        }
    }
}
