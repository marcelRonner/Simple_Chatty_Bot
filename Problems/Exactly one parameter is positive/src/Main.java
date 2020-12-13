import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean number1pos = scanner.nextInt() > 0;
        boolean number2pos = scanner.nextInt() > 0;
        boolean number3pos = scanner.nextInt() > 0;

        var win = number1pos && !number2pos && !number3pos ||
                  !number1pos && number2pos && !number3pos ||
                  !number1pos && !number2pos && number3pos;

        System.out.println(win);
    }
}