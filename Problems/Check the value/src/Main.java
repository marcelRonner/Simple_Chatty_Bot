import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var inputvar = scanner.nextInt();

        boolean check = inputvar > 0 && inputvar < 10;

        System.out.println(check);
    }
}