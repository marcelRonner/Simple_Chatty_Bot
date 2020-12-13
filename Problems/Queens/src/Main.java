import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var x1 = sc.nextInt();
        var y1 = sc.nextInt();
        var x2 = sc.nextInt();
        var y2 = sc.nextInt();

        var xmatch = x1 == x2;
        var ymatch = y1 == y2;
        var slope = Math.abs(x1 - x2) == Math.abs(y1 - y2);

        if (xmatch || ymatch || slope) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}