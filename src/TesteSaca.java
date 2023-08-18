public class TesteSaca {

    public static void main(String[] args) {

        Conta conta = new Conta(123, 453);
        try{
            conta.deposita(200.0);
            conta.saca(200.0);
        } catch (SaldoInsuficienteException ex){
            System.out.println("tratamento erro! ");
        }
    }
}
