public class Produto {
    int codigo;
    String nome;
    double preco;
    int quantidade;

    void exibirInformacoes() {
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidade);
    }
}