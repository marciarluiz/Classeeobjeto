// abstract indica que a classe é abstrata. 
// significa que não podemos criar diretamente um objeto dessa classe.
// Mas podemos criar objetos de suas classes filhas concretas.
public abstract class Conta {

    // Atributos armazenam o titular e o saldo.
    // protected permite que as subclasses acessem esses atributos, 
    // inclusive quando estiverem em outro pacote.
    protected String titular;
    protected double saldo;

    // Construtor
    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método normal
    // Método pronto e pode ser herdado pelas classes filhas.
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    // Método abstrato
    // Não possui corpo { }. Termina com ponto e vírgula ;. 
    // Define uma operação que as classes filhas concretas deverão 
    // implementar.
    public abstract void calcularTaxa();
}