public class TestaCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Porta porta = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        porta.abre();
        porta2.fecha();
        porta3.abre();
        porta.fecha();

        casa.pinta("Azul");

        System.out.println(casa.quantasPortasEstaoAbertas());
    }

}
