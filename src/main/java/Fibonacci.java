public class Fibonacci {
    public int calculaFibonacci(int value){
        return (value <= 2) ? 1 : calculaFibonacci(value-1) + calculaFibonacci(value-2);
    }
}
