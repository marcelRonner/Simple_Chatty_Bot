import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var rangeLow = sc.nextInt();
        var rangeHigh = sc.nextInt();

        int divisor = 0;
        double averageSum = 0;


        for (int i = rangeLow; i <= rangeHigh; i++) {
            if (i % 3 == 0) {
                averageSum += i;
                divisor++;
            }
        }
        double result = averageSum / divisor;
        System.out.println(result);
    }
}