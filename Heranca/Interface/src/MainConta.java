public class MainConta {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();

        conta1.exibirSaldo();

        conta1.depositar(500);

        conta1.exibirSaldo();
        
        conta1.sacar(200);

        conta1.exibirSaldo();
    }
}