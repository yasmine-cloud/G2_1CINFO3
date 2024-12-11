import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien de nombres voulez-vous additionner ?");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Entrez le nombre " + (i + 1) + " :");
            numbers[i] = scanner.nextInt();
        }

        // Appel à la méthode de la classe SumCalculator
        int sum = Tasnim_chtila.calculateSum(numbers);

        System.out.println("La somme des nombres est : " + sum);
        scanner.close();
    }
}
