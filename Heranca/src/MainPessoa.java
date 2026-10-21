public class MainPessoa {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.nome = "Marcia";
        a1.idade = 47;
        a1.matricula = "2026A01";

        a1.apresentar();
        a1.estudar();
    }
}
