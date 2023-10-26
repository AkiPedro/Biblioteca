package sem.nome.dados;

public class Aluno {

        private String nome;
        int idade;
        private static int codigoAluno=1;
        private int codigoDoColega;

        public Aluno(String nome, String idade) {
            super();
            this.nome = nome;
            this.idade = idade;
            this.codigoDoColega = codigoAluno;
            codigoAluno++;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getCodigoDoColega() {
                return codigoDoColega;
        }

}



