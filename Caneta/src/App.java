public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("sim, estou tao cansado");

        Caneta c1 = new Caneta("bic", "azul", 0.7f, 10, true);
        Caneta c2 = new Caneta("faber castell", "vermelho", 0.7f, 10, false);
        
        System.out.println("caneta 1:"); 
        c1.status();

        c1.destampar();

        c1.status();

        c1.escrever();

        System.out.println("caneta 2:");
        c2.status();



        
    }
}
