package sem.nome.dados.registrodealuno.dados;

import sem.nome.dados.Aluno;
import sem.nome.dados.Livro;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class RegistroL {
    private ArrayList<Livro> rL;

    public RegistroL() {
        rL = new ArrayList<Livro>();
    }

    public void addLivro (Livro livro) {
        rL.add(livro);
    }

    public Livro getLivro (int indice) {
        return rL.get(indice);
    }

    public void removeLivro(Livro livro) {
        rL.remove(livro);
    }

    public void removeLivro (int indice) {
        rL.remove(indice);
    }

    public int size() {
        return rL.size();
    }

    public void emprestaLivro (Livro livro, Aluno aluno){
        LocalDateTime now = LocalDateTime.now();
        livro.setDataEmprestimo(now);
        livro.setAlunoComLivro(aluno);
    }

    public void ordenaTituloAZ(){
        Collections.sort(rL);
    }
}
