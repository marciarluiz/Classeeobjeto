public class UsoGet {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
        System.out.println(idade + "eu tenho essa idade");
    }
}