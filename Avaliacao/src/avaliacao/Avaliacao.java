
package avaliacao;

public class Avaliacao {

    public static void main(String[] args) {
        
        Aluno anderson = new Aluno("Anderson");
        
        Curso ads = new Curso("ADS");
        
        Disciplina ltp_iv = new Disciplina("LTP IV"); 
        
        ads.disciplinasDisponiveis(ltp_iv);
        
        anderson.fazCurso(ads).disciplinasDisponiveis(ltp_iv);       
        
    }
    
}
