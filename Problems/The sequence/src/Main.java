import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var number = sc.nextInt();
        var index = 0;

        for (int i = 1; i <= number; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.println(i);
                index++;
                if (index == number) {
                    break;
                }
            }
            if (index == number) {
                break;
            }
        }
    }
}