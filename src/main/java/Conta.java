import java.util.Objects;

public abstract class Conta implements Comparable<Conta>{
    private static int totalDeContas;
    private int identificador;
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;

    public Conta() {
        totalDeContas += 1;
        this.identificador = totalDeContas;
    }

    public Conta(String titular) {
        this.titular = titular;
        totalDeContas += 1;
        this.identificador = totalDeContas;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public int getIdentificador() {
        return identificador;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getRendimento(){
        return saldo * 0.1;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if(valor > 0){
            this.saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor inválido");
        }
    }

    public String recuperaDadosParaImpressao(){
        return " saldo: " + this.saldo +
                " \nnumero: " + this.numero +
                " \ntitular: " + this.titular +
                " \nagencia: " + this.agencia +
                this.dataAbertura.formatada();


    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Conta)) return false;
        Conta conta = (Conta) object;
        return Objects.equals(agencia, conta.agencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "identificador=" + identificador +
                ", titular='" + titular.toUpperCase() + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", dataAbertura=" + dataAbertura +
                '}';


    }

    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }
}
