//Classe ContaBancaria
public class ContaBancaria {

    // Atributos
    //Armazena o nome do titular.
    String titular;
    //Armazena o número da conta.
    int numeroConta;
    //Armazena o saldo bancário.
    double saldo;

    // Método para depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    // Método para sacar
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    // Método para exibir o saldo
    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}