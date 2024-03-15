public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente() {
    }

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor inválido");
        }

        if(valor > super.getSaldo()){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        super.sacar(valor * 1.01);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 1.01;
    }
}