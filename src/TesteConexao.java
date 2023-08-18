public class TesteConexao {

    public static void main(String [] args) throws Exception{

        try(Conexao conexao = new Conexao()){
            conexao.receberDados();
        } catch (IllegalStateException ex){
            System.out.println("ERRO na conexao! ");
        }
    }
}
