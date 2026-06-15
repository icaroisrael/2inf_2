
package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Turma;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/turma")
public class TurmaController {

    private List<Turma> listaTurmas = new ArrayList<>();

    @GetMapping("/listar")
    public String abrirFormulario(Model model) {
        model.addAttribute("turma", new Turma());
        model.addAttribute("listaTurmas", listaTurmas);
        return "Cadastro";
    }

    @PostMapping("/salvar")
    public String salvarTurma(@ModelAttribute Turma turma, Model model) {

        listaTurmas.add(turma);

        model.addAttribute("turma", new Turma());
        model.addAttribute("listaTurmas", listaTurmas);

        return "Cadastro";
    }
}
