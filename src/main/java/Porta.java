public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    public void abre(){
        this.aberta = true;
    }

    public void fecha(){
        this.aberta = false;
    }

    public void pinta(String color){
        this.cor = color;
    }

    public boolean estaAberta(){
        return this.aberta;
    }
}
