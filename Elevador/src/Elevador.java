import java.util.Scanner;

public class Elevador {
    int Capacidade = 8;
    int TotalAndares = 10;
    int AndarAtual = 0;
    int PessoasPresentes = 0;
    int Andar;

    public Elevador(){

    }

    public Elevador(int Capacidade, int TotalAndares, int AndarAtual, int PessoasPresentes){
        this.Capacidade = Capacidade;
        this.TotalAndares = TotalAndares;
        this.AndarAtual = AndarAtual;
        this.PessoasPresentes = PessoasPresentes;

    }

    public int getCapacidade(){
        return Capacidade;
    }

    public void setCapacidade(int Capacidade){
        this.Capacidade = Capacidade;
    }

    public int getTotalAndares(){
        return TotalAndares;
    }

    public void setTotalAndares (int TotalAndares){
        this.TotalAndares = TotalAndares;
    }

    public int getAndarAtual(){
        return AndarAtual;
    }

    public void setAndarAtual(int AndarAtual){
        this.AndarAtual = AndarAtual;
    }

    public int getPessoasPresentes(){
        return PessoasPresentes;
    }
    
    public void setPessoasPresentes(int PessoasPresentes){
        this.PessoasPresentes = PessoasPresentes;
    }

    public int getandar(){
        return Andar;
    }

    public void setandar(int Andar){
        this.Andar = Andar;
    }

    //Métodos
    

    public void Entrar(){
        if (this.PessoasPresentes >= Capacidade ){
            System.out.println("ELEVADOR CHEIO.");
        }else{
            this.PessoasPresentes++;
            System.out.println("uma pessoa entrou no elevador.");
        }
    }


    public void Sair(){
        if (this.PessoasPresentes == 0){
            System.out.println("NÃO TEM MAIS NINGUEM PARA SAIR.");
        }else{
            this.PessoasPresentes--;
            System.out.println("uma pessoa saiu do elevador.");
        }
    }


    public void Deslocar(){
        do{
            Scanner andares = new Scanner(System.in);
            System.out.println("qual andar deseja ir? (0 a " + TotalAndares + "): ");
            int andar = andares.nextInt();
            if(andar > TotalAndares || andar < 0){
                System.out.println("esse andar não existe");
            }else{
                if (andar == AndarAtual){
                    System.out.println("Você já está no " + AndarAtual + "º andar");
                }else{
                    if(andar < AndarAtual){
                        for(int i = AndarAtual; i > Andar; i--){
                            System.out.println("Descendo... " + (i-1) + "º andar");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                System.out.println("A descida foi interrompida.");
                            }
                        }
                    }else{
                        for(int i = AndarAtual; i < andar; i++){
                            System.out.println("Subindo... " + (i+1) + "º andar");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                System.out.println("A subida foi interrompida.");
                            }
                        }
                    }
                }
                    AndarAtual = andar;
                    if(andar == 0)
                        System.out.println("Você está no térreo");
                    else
                     System.out.println("Você está no " + AndarAtual + "º andar");
            }
        }while(Andar < 0 || Andar > TotalAndares);
    }


    public void status(){
        System.out.println("_____________________________");
        System.out.println("           ELEVADOR          ");
        System.out.println("_____________________________");
        System.out.println("(" + PessoasPresentes + " Pessoas Presentes)");
        System.out.println("Andar Atual: " + AndarAtual);
        System.out.println("Total de Andares: " + TotalAndares + "");
        System.out.println("Capacidade: " + Capacidade + " Pessoas");
        System.out.println("_____________________________");
        System.out.println();
    }


}
