// classe chamada Aluno.
// Construtor Aluno
public class Aluno {

    // Atributos
    // Cria um atributo para armazenar o nome do aluno.
    String nome;
    // Cria um atributo para armazenar a idade do aluno.
    int idade;

    // Construtor é um bloco especial de código executado 
    // automaticamente quando criamos um objeto.
    // Construtor que recebe dois parâmetros.
    // Tem o mesmo nome da classe (Aluno).
    // Não possui tipo de retorno, nem mesmo void.
    // Pode receber parâmetros para inicializar os atributos.
    Aluno (String nome, int idade) {
        // Atribui o nome recebido ao atributo do objeto.
        // this.nome representa o atributo pertencente ao objeto.
        // nome representa o parâmetro recebido pelo construtor.
        this.nome = nome;
        // Atribui a idade recebida ao atributo do objeto.
        this.idade = idade;
    }
    public static void main(String[] args) {
        System.out.println("aaa");
    }
}