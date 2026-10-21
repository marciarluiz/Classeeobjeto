public class MainConta {

    public static void main(String[] args) {

        ContaCorrente conta1 =
            new ContaCorrente("Carlos", 1000);

        conta1.exibirSaldo();
        conta1.calcularTaxa();
    }
}
