/*void main() {
         System.out.println("Olá, mundo!");
}
*/
public class Main {
  public static void main(String[] args) {

    // Criando personagem sem parâmetros
    Personagem p1 = new Personagem();

    // Criando personagem com parâmetros
    Personagem p2 = new Personagem("Thor", "Asgardiana", 100);

    // Exibindo o primeiro personagem
    System.out.println("PERSONAGEM 1");
    System.out.println("Nome: " + p1.nome);
    System.out.println("Armadura: " + p1.armadura);
    System.out.println("Pontos de vida: " + p1.pontosDeVida);
    System.out.println("---------------------");

    // Exibindo o segundo personagem
    System.out.println("PERSONAGEM 2");
    System.out.println("Nome: " + p2.nome);
    System.out.println("Armadura: " + p2.armadura);
    System.out.println("Pontos de vida: " + p2.pontosDeVida);
  }
}