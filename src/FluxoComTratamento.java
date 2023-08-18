public class FluxoComTratamento {

    public static void main(String[] args){
        System.out.println("Inicio metodo main");
        try{
            metodo1();
        } catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            ex.printStackTrace();
            System.out.println("ERRO: ArithmeticException ou NullPointerException: " + msg);
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
        for(int i = 0; i<=3; i++){
            System.out.println(i);
            /*try{
                int numero = i / 0;
            } catch (ArithmeticException erro){
                System.out.println("ERRO: ArithmeticException");
            }*/
           // int numero = i / 0;
            Conta conta = null;
            conta.deposita(98);

        }
        System.out.println("Fim metodo 2");
    }
}