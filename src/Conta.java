public class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private String titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de conta é "+ Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        System.out.println("Estou criando uma conta " + this.numero);
    }
    public void deposita (double valor) throws SaldoInsuficienteException {
        this.saldo += valor;
    }

    public void saca(double valor){
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Saldo" + this.saldo + ", Valor: " + valor);
        }
            this.saldo -= valor;
    }

    public void trasnfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

}
