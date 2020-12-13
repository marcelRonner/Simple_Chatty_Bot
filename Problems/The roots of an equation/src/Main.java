import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var a = sc.nextInt();
        var b = sc.nextInt();
        var c = sc.nextInt();
        var d = sc.nextInt();

        for (int i = 0; i <= 1000; i++){
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}