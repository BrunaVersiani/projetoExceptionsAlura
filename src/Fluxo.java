public class Fluxo {

    public static void main(String[] args){
        System.out.println("Inicio metodo main");
        try{
            metodo1();
        } catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            ex.printStackTrace();
            System.out.println("ERRO MENSSAGEM EXCEPTION: " + msg);
        }

        System.out.println("Fim metodo main");
    }

    public static void metodo1(){
        System.out.println("Inicio metodo 1");
       metodo2();
        System.out.println("Fim metodo 1");
    }

    public static void metodo2(){
        System.out.println("Inicio metodo 2");

       // ArithmeticException exception = new ArithmeticException( "Deu errado!");
       // throw exception;

       throw new ArithmeticException( "Deu errado!" + " Nesse formato em uma linha, tem o mesmo resultado que as 2 linhas de cima e é mais utilizada no dia a dia.");

        //System.out.println("Fim metodo 2");
    }
}