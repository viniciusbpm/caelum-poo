public class ImprimePorRegra {
    public static void main(String[] args) {
        int x = 13;

        while(x != 1){
            if(x % 2 == 0){
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            if(x == 1){
                System.out.println(x);
            } else {
                System.out.print(x + " -> ");
            }
        }
    }
}
