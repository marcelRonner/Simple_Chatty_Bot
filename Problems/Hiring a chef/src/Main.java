import java.io.PrintStream;
import java.util.Scanner; //put imports you need here

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("FirstName:");
        String name = scanner.next();
        //System.out.println("Age:");
        String age = scanner.next();
        //System.out.println("Stage of Education:");
        String stageOfEducation = scanner.next();
        //System.out.println("Years of Experience:");
        String yearsOfExperience = scanner.next();
        //System.out.println("Cuisine Preference:");
        String cuisinePreference = scanner.next();
        System.out.printf("The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.", name, cuisinePreference);
    }
}