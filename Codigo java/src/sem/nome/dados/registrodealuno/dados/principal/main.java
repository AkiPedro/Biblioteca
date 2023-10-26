package sem.nome.dados.registrodealuno.dados.principal;
import sem.nome.dados.Aluno;
import sem.nome.dados.registrodealuno.dados.RegistroA;
import sem.nome.dados.registrodealuno.dados.RegistroL;
import java.util.Scanner;

public class main {
    private static Scanner tc = new Scanner(System.in);
    private static RegistroL rL;
    private static RegistroA rC;

    private static void adicionaAluno() {
        String nome, idade;
        Aluno c;
        System.out.println("==> Adicionar colega:\n");
        System.out.print("Nome: ");
        nome = tc.nextLine();
        System.out.print("Idade: ");
        idade = tc.nextLine();

        c = new Aluno(nome, idade);
        rC.addAluno(c);
    }

    int op;
		do {
        System.out.println("\n==> Menu:\n");
        System.out.println("   0 - sair");
        System.out.println("   1 - adiciona livro");
        System.out.println("   2 - adiciona colega");
        System.out.println("   3 - emprestar livro");
        System.out.println("   4 - devolver livro");
        System.out.println("   5 - listar livros por ordem alfabetica");
        System.out.print("\n   Opcao: ");
        op = tc.nextInt();
        tc.nextLine(); // consumir o enter

        switch (op) {
            case 0:
                System.out.println("Saindo..."); // System.exit(0);
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            default:
                System.out.println("Opcao invalida!\n\n");
                break;
        }
    } while (op != 0);

}

}


}
