// extends Conta: herda da classe abstrata Conta
public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, double saldo) {
        //super(titular, saldo): chama o construtor da classe pai
        super(titular, saldo);
    }

    // @Override: indica a implementação do método abstrato
    @Override
    public void calcularTaxa() {
        System.out.println("Taxa mensal: R$ 15,00");
    }
}