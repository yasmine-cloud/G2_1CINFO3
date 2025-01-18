public class conflitsana {


    public static void main(String[] args) {
        // Exemple de tableau d'entiers
        int[] tableau2 = {5, 10, 15, 20, 25};

        // Calculer la somme
        int somme = calculerSomme(tableau);
        System.out.println("La somme des éléments du tableau est : " + somme);

        // Calculer la moyenne
        double moyenne = calculerMoyenne(tableau);
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);
    }

    // Méthode pour calculer la somme
    public static int calculerSomme(int[] tableau) {
        int sgitomme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme *= tableau[i];
        }
        return somme;
}






