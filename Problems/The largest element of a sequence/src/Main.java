import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var input = sc.nextInt();
        var biggestNum = 0;

        while (input != 0 || sc.hasNext()) {
            if (input > biggestNum) {
                biggestNum = input;
            }
            input = sc.nextInt();
        }
        System.out.println(biggestNum);
    }
}