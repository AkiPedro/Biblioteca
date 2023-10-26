package sem.nome.dados.registrodealuno.dados;
import sem.nome.dados.Aluno;
import java.util.ArrayList;


    public class RegistroA {

    private ArrayList<Aluno> registroDeAluno;

    public RegistroA() {
        registroDeAluno = new ArrayList<Aluno>();
    }

    public void addAluno (Aluno aluno) {
        registroDeAluno.add(aluno);
    }

    public Aluno getAluno (int indice) {
        return registroDeAluno.get(indice);
    }

    public void removeAluno(Aluno colega) {
        registroDeAluno.remove(colega);
    }

    public void removeAluno (int indice) {
        registroDeAluno.remove(indice);
    }

    public int size() {
        return registroDeAluno.size();
    }
}

