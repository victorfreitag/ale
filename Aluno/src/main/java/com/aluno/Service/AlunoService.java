package com.aluno.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluno.Repository.AlunoRepository;
import com.aluno.entities.Aluno;

@Service
public class AlunoService {

private AlunoRepository alunoReporitorio;
	
	@Autowired
	public AlunoService(AlunoRepository alunoReporitorio) {
		this.alunoReporitorio = alunoReporitorio;
	}
	public Aluno saveAluno(Aluno aluno) {
		return alunoReporitorio.save(aluno);
	}
	public Aluno GetAlunoById(Long idAluno) {
		return alunoReporitorio.findById(idAluno).orElse(null);
	}
	public List<Aluno> getAllAlunos(){
		return alunoReporitorio.findAll();
	}
	public void deleteAluno(Long idAluno) {
		alunoReporitorio.deleteById(idAluno);
	}
	

}
