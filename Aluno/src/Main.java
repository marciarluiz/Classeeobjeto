// Classe Main
public class Main {

    public static void main(String[] args) {
        // Aluno é o Tipo da variável, definido pela classe.
        // pessoa1 é o Nome da variável que referencia o objeto.
        // = é o Operador de atribuição.
        // new: Cria um novo objeto.
        // Aluno("Carlos", 25): Chama o construtor passando dois argumentos
        // "Carlos": Argumento para o parâmetro nome
        // 25: Argumento para o parâmetro idade
        Aluno pessoa1 = new Aluno ("Carlos", 25);
        // Acessa o atributo nome do objeto pessoa1 e exibe seu valor.
        System.out.println("Nome: " + pessoa1.nome);
        //Acessa o atributo idade do mesmo objeto e exibe seu valor.
        System.out.println("Idade: " + pessoa1.idade);

        // Objeto criado: pessoa1
    }
}
