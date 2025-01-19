public class Tasnim_chtila {

    public static String convertToUpperCase(String input) {
        if (input == null) {
            return ""; // Retourner une chaîne vide si l'entrée est null
        }

        input = input.trim();
        input = input.replace(" ", "_");  // Fusionner la modification de tasnimamd

        return input.toUpperCase();
    }
}
