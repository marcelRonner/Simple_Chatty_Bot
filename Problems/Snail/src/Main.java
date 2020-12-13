import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var poleheight = scanner.nextInt();
        var up = scanner.nextInt();
        var down = scanner.nextInt();

        var day = up - down;
        var traveldistance = poleheight - up;
        var roundedday = (traveldistance + day - 1) / day; //divide traveldistance by days (add denominator - 1
                                                           //to nominator to round up the result
        var total =  (roundedday) + 1;                     //add the last day needed to reach the pole end from
                                                           //the traveldistance

        System.out.println(total);
    }
}