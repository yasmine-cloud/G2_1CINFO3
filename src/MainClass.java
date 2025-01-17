import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une chaîne de caractères : ");
        String input = scanner.nextLine();

        // Appeler la méthode convertToUpperCase de StringUtils
        String upperCaseString =Tasnim_chtila .convertToUpperCase(input);

        System.out.println("La chaîne en majuscules est : " + upperCaseString);

        scanner.close();
    }
}
