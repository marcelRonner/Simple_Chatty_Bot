import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var entry = scanner.nextInt();
        var hundert = entry / 100;
        var zehner = (entry - (hundert * 100)) / 10;
        var einer = entry - ((hundert * 100) + (zehner * 10));

        var resultat = hundert + zehner + einer;

        System.out.println(resultat);
    }
}