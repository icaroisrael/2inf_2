package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Ocorrencia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Controller
public class OcorrenciaController {

 private final List<Ocorrencia> ocorrencias = new ArrayList<>();

        @GetMapping("/ocorrencia")
        public String abrirFormulario(Model model) {
            model.addAttribute("ocorrencia", new Ocorrencia());
        model.addAttribute("listaOcorrencia", ocorrencias);
        return "cadastro";
    }
        @PostMapping("/ocorrencia")
        public String salvarOcorrencia(Ocorrencia ocorrencia) {

            ocorrencias.add(ocorrencia);
            System.out.println(ocorrencia.getAluno());
            System.out.println(ocorrencia.getData());
            System.out.println(ocorrencia.getDisciplina());
            System.out.println(ocorrencia.getTurma());
            System.out.println(ocorrencia.getLugar());
            System.out.println(ocorrencia.getProfessor());
            System.out.println(ocorrencia.getMotivo());
                return "redirect:/ocorrencia";
        }
}
