public class TestaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        for(int i = 0; i < contas.length; i++){
            Conta conta = new ContaCorrente();
            conta.depositar(100 * i);
            contas[i] = conta;
        }

        double media = 0;

        for(int i = 0; i < contas.length; i++){
            media += contas[i].getSaldo();
        }

        System.out.println("Média de saldos: " + (media / contas.length));


    }
}
