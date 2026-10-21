public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "Bob";
        cachorro1.idade = 3;

        cachorro2.nome = "Rex";
        cachorro2.idade = 5;

        cachorro1.latir();
        cachorro2.latir();
    }
}