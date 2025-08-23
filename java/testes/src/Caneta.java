public class Caneta {
    
    private String Marca;
    private String Cor;
    private float Ponta;
    private int Carga;
    private boolean Tampada;

    public Caneta(){

    }

     public Caneta(String marca, String cor, float ponta, int carga, boolean tampada){
        this.Marca = marca;
        this.Cor = cor;
        this.Ponta = ponta;
        this.Carga = carga;
        this.Tampada = tampada;

    }

    public String getMarca(){
        return Marca;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public float getPonta() {
        return Ponta;
    }

    public void setPonta(float ponta) {
        Ponta = ponta;
    }

    public int getCarga() {
        return Carga;
    }

    public void setCarga(int carga) {
        Carga = carga;
    }

    public boolean isTampada() {
        return Tampada;
    }

    public void setTampada(boolean tampada) {
        Tampada = tampada;
    }

    

    public void status(){
        System.out.println("cor: " + Cor );
        System.out.println("marca: " + Marca);
        System.out.println("ponta: " + Ponta);
        System.out.println("carga: " + Carga);
        System.out.println("tampada? " + Tampada);

    }

    public void escrever(){
        if (Tampada == false){
            System.out.println("escrevendo.");
        }else{
            System.out.println("Não é possivel escrever. Destampe-a para escrever.");
        }
    }

    public void tampar(){
        if(Tampada == false){
            Tampada = true;
        }
    }

    public void destampar(){
        if(Tampada == true){
            Tampada = false;
        }
    }



}
