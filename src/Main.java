
public class Main {
    public static void main(String[] args) {

        System.out.printf("FizzBuzz Tæl op:");

        for (int i = 1; i <= 100; i++) {
            if(100 % 3 == 0){
                System.out.println("Fizz");
            } else if(100 % 5 == 0){
                System.out.println("Buzz");
            } else if (100 % 3 == 0 && 100 % 5 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
