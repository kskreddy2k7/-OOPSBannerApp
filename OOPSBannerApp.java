 feature/UC6-Methods

  feature/UC5-InlineArray
 main
public class OOPSBannerApp {

    public static void main(String[] args) {

 feature/UC6-Methods
        // Build banner using helper methods
        String[] banner = new String[7];

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Combine patterns line by line
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Helper method for letter P
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Helper method for letter S
    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };

        // Inline Array Initialization with String.join()
        String[] banner = {

 feature/UC1-PrintOOPS


public class OOPSBannerApp {

  
    public static void main(String[] args) {

       
        System.out.println("OOPS");

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all banner lines inside an array
        String[] banner = {

            main
                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        "  ****** ",
                        "  *****  "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *       "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " ******  ",
                        "  *****  "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "       * "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        " *     * "),

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        " *       ",
                        "  *****  ")
        };

         feature/UC5-InlineArray
        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }

        // Use loop instead of multiple print statements
        for (String line : banner) {
            System.out.println(line);
        }
        main
        main
    }
}
