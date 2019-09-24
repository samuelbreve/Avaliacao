
package avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    public String nome;
    public List<Disciplina> disciplinas = new ArrayList<>();
    
    public Curso(String nome) {
        this.nome = nome;
    }
    
    public Disciplina disciplinasDisponiveis(Disciplina disciplina) {
        Disciplina disciplinasD = new Disciplina(nome);
	this.disciplinas.add(disciplinasD);
	return disciplinasD;
    }
    
}
