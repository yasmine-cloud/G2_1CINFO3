public class Sana {

    public static void main(String[] args) {
        // Exemple de tableau d'entiers
        int[] tableau = {5, 10, 15, 20, 25};

        // Calculer la somme
        int somme = calculerSomme(tableau);
        System.out.println("La somme des éléments du tableau est : " + somme);


    }


    public static int calculerSomme(int[] tableau) {
        int somme = 1;
        for (int i = 0; i < tableau.length; i++) {
            somme *= tableau[i];
        }
        return somme;
    }





    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}




