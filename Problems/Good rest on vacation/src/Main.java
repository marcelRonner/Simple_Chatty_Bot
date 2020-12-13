import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var duration = scanner.nextInt();
        var foodCost = scanner.nextInt();
        var oneWayFlight = scanner.nextInt();
        var oneNightHotel = scanner.nextInt();

        var sum = duration * foodCost + (duration - 1) * oneNightHotel + 2 * oneWayFlight;

        System.out.println(sum);
    }
}