package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Aluno")
public class AlunoController {

    @GetMapping("/listar")
    public String abrirFormulario(Model model) {

        model.addAttribute("aluno", new Aluno());

        List<Aluno> listarAlunos = new ArrayList<>();
        model.addAttribute("listarAlunos", listarAlunos);

        return "cadastro";
    }

    @PostMapping("/salvar")
    public String salvarAluno(Aluno aluno) {

        System.out.println(aluno.getNumero());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getSexo());
        System.out.println(aluno.getTurma());
        System.out.println(aluno.getMatricula());

        return "cadastro";
    }
}