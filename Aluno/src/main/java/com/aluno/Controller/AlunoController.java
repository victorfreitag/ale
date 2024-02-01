package com.aluno.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.Service.AlunoService;
import com.aluno.entities.Aluno;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	private AlunoService alunoService;

	@Autowired
	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	@PostMapping
	public Aluno createAluno(@RequestBody Aluno aluno) {
		return alunoService.saveAluno(aluno);
	}
	@GetMapping
	public Aluno getAluno(@PathVariable Long idAluno) {
		return alunoService.GetAlunoById(idAluno);
	}
	@GetMapping
	public List<Aluno> getAllAluno() {
		return alunoService.getAllAlunos();
	}
	@DeleteMapping("/{id}")
	public void deletarAluno(@PathVariable Long idAluno) {
		alunoService.deleteAluno(idAluno);
	}
	
	
}
