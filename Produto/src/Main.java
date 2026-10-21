//Main é a classe principal
public class Main {
    // Método principal
    // Método responsável por iniciar a execução.
    public static void main(String[] args) {
        //Produto produto1 = Declara uma variável chamada produto1, do tipo Produto.
        //new Produto() = Cria um novo objeto da classe Produto. Instanciação.
        Produto produto1 = new Produto();
        
        //Atributos
        //Define o código do produto como 101.
        produto1.codigo = 101;
        //Define o nome do produto.
        produto1.nome = "Notebook";
        //Define o preço como R$ 3.499,90.
        produto1.preco = 3499.90;
        //Define a quantidade em estoque.
        produto1.quantidade = 5;
        //Chama o método responsável por mostrar as informações do produto.
        produto1.exibirInformacoes();
    }
}
