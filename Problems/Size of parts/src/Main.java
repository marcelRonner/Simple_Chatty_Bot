import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var countParts = sc.nextInt();
        var canBeFixed = 0;
        var reject = 0;
        var perfect = 0;

        for (int i = 1; i <= countParts; i++) {
            var actualPart = sc.nextInt();

            if (actualPart == 1) {
                canBeFixed++;
            } else if (actualPart == 0) {
                perfect++;
            } else if (actualPart == -1) {
                reject++;
            }
        }
        System.out.println(perfect + " " + canBeFixed + " " + reject);
    }
}