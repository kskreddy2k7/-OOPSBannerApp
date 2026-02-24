 feature/UC1-PrintOOPS


public class OOPSBannerApp {

  
    public static void main(String[] args) {

       
        System.out.println("OOPS");

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all banner lines inside an array
        String[] banner = {

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

        // Use loop instead of multiple print statements
        for (String line : banner) {
            System.out.println(line);
        }
        main
    }
}
