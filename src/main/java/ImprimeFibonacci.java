public class ImprimeFibonacci {
    public static void main(String[] args) {
        int count = 0;
        int count2 = 1;

        System.out.println(count);
        System.out.println(count2);

        while(count < 100){
            count = count + count2;
            count2 = count + count2;
            System.out.println(count);
            System.out.println(count2);
        }
    }
}
