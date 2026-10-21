// implements: indica que a classe implementa uma interface
// A classe ContaCorrente é obrigada a implementar os métodos 
// depositar() e sacar() porque declarou implements OperacoesBancarias.
public class ContaCorrente implements OperacoesBancarias {

    double saldo = 1000;
    // @Override: ndica que o método implementa o contrato
    @Override
    //depositar(): crescenta dinheiro ao saldo
    public void depositar(double valor) {
        // saldo += valor: soma o valor ao saldo
        saldo += valor;
        System.out.println("Depósito: R$ " + valor);
    }

    @Override
    // sacar(): retira dinheiro, respeitando as condições
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
                        //saldo -= valor: subtrai o valor do saldo
            saldo -= valor;
            System.out.println("Saque: R$ " + valor);
        } else {
            System.out.println("Saque não permitido!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}
