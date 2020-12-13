import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var number = sc.nextInt();

        while (number != 0) {

            if (number % 2 == 0) {
                System.out.println("even");
            }
            else  {
                System.out.println("odd");
            }

            number = sc.nextInt();

        }
    }
}