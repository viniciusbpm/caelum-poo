public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    public void pinta(String color){
        this.cor = color;
    }

    public int quantasPortasEstaoAbertas(){
        int quantidade = 0;

        if(porta1.estaAberta()){
            quantidade++;
        }
        if(porta2.estaAberta()){
            quantidade++;
        }
        if(porta3.estaAberta()){
            quantidade++;
        }

        return quantidade;
    }
}
