import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = sc.nextInt();
        double yearlyInterest = 1 + (sc.nextDouble() / 100);
        double targetAmount = sc.nextInt();
        var years = 0;

        while (money < targetAmount) {
            money = money * yearlyInterest;
            years++;
        }
        System.out.println(years);
    }
}