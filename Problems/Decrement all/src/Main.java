import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n1 = scanner.nextInt();
        var n2 = scanner.nextInt();
        var n3 = scanner.nextInt();
        var n4 = scanner.nextInt();

        System.out.printf("%s %s %s %s", --n1, --n2, --n3, --n4);
    }
}