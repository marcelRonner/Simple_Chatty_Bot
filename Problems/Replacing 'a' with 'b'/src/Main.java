import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var input = sc.next();
        var output = input.replace("a","b");
        System.out.println(output);
    }
}