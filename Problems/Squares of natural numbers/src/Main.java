import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var input = sc.nextInt();
        var square = 0;
        var naturalNumber = 1;

        do {
            square = naturalNumber * naturalNumber;
            naturalNumber++;
            if (square <= input) {
                System.out.println(square);
            }
        } while (square <= input);
    }
}