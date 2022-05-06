public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.exibirNome();
        Aluno.exibirNome();

        a1.nome = "Pedro";
        a1.idade = 22;
        Aluno.instituicao = "USJT";
        System.out.println(Aluno.instituicao);

        a2.nome = "José";
        a2.idade = 34;
        Aluno.instituicao = "USJT";
        System.out.println(Aluno.instituicao);

        Aluno.instituicao = "USJT - Mooca";

        System.out.println(Aluno.instituicao);
    }
}
