public class SomarGastoTotal {
    public static void main(String[] args) {
        double janeiro = 15000;
        double fevereiro = 23000;
        double marco = 17000;

        double total = janeiro + fevereiro + marco;
        double media = total / 3;

        System.out.println("Despesa total:" + total);
        System.out.println("Média total:" + media);
    }
}
