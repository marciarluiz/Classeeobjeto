// public interface: declara uma interface.
// OperacoesBancarias: nome da interface.
public interface OperacoesBancarias {
    //void depositar(double valor): define a operação de depósito.
    void depositar(double valor);
    //void sacar(double valor): define a operação de saque.
    void sacar(double valor);
    //os métodos não possuem { }, pois estamos apenas declarando o contrato.
    //Em uma interface, esses métodos são implicitamente public e abstract.
}