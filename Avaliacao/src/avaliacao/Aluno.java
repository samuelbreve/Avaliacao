package avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    
    public String nome;
    public List<Curso> cursos = new ArrayList<>();
    
    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public Curso fazCurso(Curso curso) {
        Curso cursa = new Curso(nome);
	this.cursos.add(cursa);
	return cursa;
    }
}
