import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var numberActual = sc.nextInt();
        var asc = false;
        var desc = false;
        var quit = false;

        while (numberActual != 0) {
            var numberLast = numberActual;
            numberActual = sc.nextInt();

            if (numberActual == 0) {
                break;

            } else if (numberActual >= numberLast) {
                if (desc) {
                    quit = true;
                }
                asc = true;

            } else if (numberActual <= numberLast) {
                if (asc) {
                    quit = true;
                }
                desc = true;
            }
        }
        if (quit == true) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}