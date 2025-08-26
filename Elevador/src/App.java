import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Elevador elevador = new Elevador();
        Scanner respostas = new Scanner(System.in);
        
       
        do{

            elevador.status();
            System.out.println("O que deseja fazer? \n1 - Entrar \n2 - Sair \n3 - Deslocar \n4 - Sair do programa");

            switch(respostas.nextInt()){
                case 1:
                elevador.Entrar();
                break;

                case 2:
                elevador.Sair();
                break;

                case 3:
                elevador.Deslocar();
                break;

                case 4:
                System.out.println("Programa finalizado.");
                break;

                default:
                System.out.println("Opção inválida");

            }
        }while(respostas.nextInt() != 4);
       
        respostas.close();
    }


}
