public class Sana {

    public static void main(String[] args) {
        // Exemple de tableau d'entiers
        int[] tableau = {5, 10, 15, 20, 25};

        // Calculer la somme
        int somme = calculerSomme(tableau);
        System.out.println("La somme des éléments du tableau est : " + somme);

        // Calculer la moyenne
        double moyenne = calculerMoyenne(tableau);
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);
    }

    // Méthode pour calculer la somme
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }

    // Méthode pour calculer la moyenne
    public static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) {
            return 0; // Eviter la division par zéro si le tableau est vide
        }
        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }
}


