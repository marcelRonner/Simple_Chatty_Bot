import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var number = sc.next();
        var a = number.charAt(0);
        var b = number.charAt(1);
        var c = number.charAt(2);
        var d = number.charAt(3);

            if (a == d && b == c) {
                System.out.println(1);
            } else {
                System.out.println(99);
            }
        }
    }
