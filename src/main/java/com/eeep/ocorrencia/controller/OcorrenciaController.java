package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OcorrenciaController {

    @GetMapping("/")
    public String abrirFormulario(Model model) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno(25, "Levy Neto", "M"));
        alunos.add(new Aluno(9, "Eloá Calista", "F"));
        alunos.add(new Aluno(29, "Maria Dasmim", "F"));
        alunos.add(new Aluno(20, "Emanuel Gonçalves", "M "));

        model.addAttribute("listaAlunos", alunos);
        return "cadastro";

    }
}
