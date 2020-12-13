import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var inputString = sc.next();
        var rangeFrom = sc.nextInt();
        var rangeTo = sc.nextInt();

        System.out.println(inputString.substring(rangeFrom , rangeTo + 1));
    }
}