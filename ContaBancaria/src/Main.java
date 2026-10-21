public class Main {
    public static void main(String[] args) {

        // Criando um objeto da classe.
        ContaBancaria conta1 = new ContaBancaria();

        // Atribuindo valores
        conta1.titular = "Carlos";
        conta1.numeroConta = 12345;
        conta1.saldo = 1000.00;

        // Exibindo saldo inicial
        conta1.exibirSaldo();

        // Realizando depósito: acrescenta R$ 500 ao saldo.
        conta1.depositar(500.00);

        // Realizando saque: retira R$ 200 do saldo.
        conta1.sacar(200.00);

        // Exibindo saldo final: mostra as informações da conta.
        conta1.exibirSaldo();
    }
}
