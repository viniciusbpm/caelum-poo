public class TestaPorta {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.abre();
        porta.fecha();
        porta.abre();
        porta.fecha();
        porta.abre();
        porta.fecha();
        porta.abre();
        porta.fecha();

        porta.pinta("Azul");
        porta.pinta("Amarelo");
        porta.pinta("Vermelho");

        porta.dimensaoX = 22.3;
        porta.dimensaoY = 42.3;
        porta.dimensaoZ = 33.3;

        System.out.println(porta.estaAberta());
    }

}
