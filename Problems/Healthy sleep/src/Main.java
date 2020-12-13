import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var shouldSleep = scanner.nextInt();
        var noMoreThanthis = scanner.nextInt();
        var actualSleep = scanner.nextInt();

        if (actualSleep > noMoreThanthis) {
            System.out.println("Excess");
        } else if (actualSleep < shouldSleep) {
            System.out.println("Deficiency");
        } else  {
            System.out.println("Normal");
        }
    }
}