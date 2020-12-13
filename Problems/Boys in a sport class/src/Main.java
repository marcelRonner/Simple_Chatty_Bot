import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var height1 = scanner.nextInt();
        var height2 = scanner.nextInt();
        var height3 = scanner.nextInt();

        var ascending = height1 <= height2 && height2 <= height3;
        var descending = height1 >= height2 && height2 >= height3;

        System.out.println(ascending || descending);
    }
}