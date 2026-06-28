package com.exemplo.escola.service;

import com.exemplo.escola.model.Professor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    private final List<Professor> professores = new ArrayList<>();

    public List<Professor> listarTodos() {
        return professores;
    }

    public Optional<Professor> buscarPorId(Long id) {
        return professores.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public Professor salvar(Professor professor) {
        professores.add(professor);
        return professor;
    }

    public Professor atualizar(Long id, Professor professorAtualizado) {
        Professor professor = buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));

        professor.setNome(professorAtualizado.getNome());
        professor.setEmail(professorAtualizado.getEmail());
        professor.setDisciplina(professorAtualizado.getDisciplina());

        return professor;
    }

    public void excluir(Long id) {
        professores.removeIf(p -> p.getId().equals(id));
    }
}