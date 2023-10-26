package sem.nome.dados;
import java.time.LocalDateTime;

public class Livro implements Comparable<Livro>{

    private String titulo, autor;
    private LocalDateTime dataEmprestimo;
    private static int codLv=1;
    private int codigoDoLivro;
    Aluno alunoComLivro;

    public Livro(String titulo, String autor) {
        super();
        this.titulo = titulo;
        this.autor = autor;

        dataEmprestimo = null;
        alunoComLivro = null;
        this.codigoDoLivro = codLv;
        codLv++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    public int getCodigoDoLivro() {
        return codigoDoLivro;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getAlunoComLivro() {
        return alunoComLivro.getNome();
    }

    public void setAlunoComLivro(Aluno colegaComLivro) {
        this.alunoComLivro = colegaComLivro;
    }

    public int compareTo(Livro l) {
        return this.titulo.compareToIgnoreCase(l.getTitulo());
    }


}
