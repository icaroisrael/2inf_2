package com.eeep.ocorrencia.controller;

import org.springframework.stereotype.Controller;
import com.eeep.ocorrencia.model.Usuario;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

    @Controller
    public class LoginController {

        @GetMapping("/login")
        public String exibirLogin(Model model){
            model.addAttribute("usuario", new Usuario());
            return "login";
        }

        @PostMapping("/login")
        public String fazerLogin(@ModelAttribute Usuario usuario, Model model) {

            model.addAttribute("nome", usuario.getNome());
            return "home";
        }
    }