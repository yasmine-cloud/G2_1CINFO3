public class Tasnim_chtila {

    public static String convertToUpperCase(String input) {
        if (input == null) {
            return ""; // Retourner une chaîne vide si l'entrée est null
        }

        // Modification dans la branche tasnimamd
        input = input.trim();
        input = input.replace(" ", "_");  // Ajouter une nouvelle modification

        return input.toUpperCase();
    }
}
