public class Conexao implements AutoCloseable{

    public Conexao(){
        System.out.println("Abrindo conexão! ");
    }

    public void receberDados(){
        System.out.println("Recebendo Dados... ");
        throw new IllegalStateException();
    }

    @Override
    public void close(){
        System.out.println("Fechando esta conexão! ");
    }
}
