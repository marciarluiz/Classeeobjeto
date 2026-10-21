public class Personagem {
    String nome;
    String armadura;
    int pontosDeVida;

    // Construtor sem parâmetros
    public Personagem() {
        this.nome = "";
        this.armadura = "";
        this.pontosDeVida = -1;
    }

    // Construtor com parâmetros
    public Personagem(String nome, String armadura, int pontosDeVida) {
        this.nome = nome;
        this.armadura = armadura;
        this.pontosDeVida = pontosDeVida;
    }
}