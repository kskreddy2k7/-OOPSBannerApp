
 dev
 dev

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

 main

public static void main(String[] args) {

 dev
    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS (O O P S)
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}
 main

    System.out.println("  *****   *****   ******   *****  ");
    System.out.println(" *     * *     *  *     *  *      ");
    System.out.println(" *     * *     *  *     *  *      ");
    System.out.println(" *     * *     *  ******   *****  ");
    System.out.println(" *     * *     *  *            *  ");
    System.out.println(" *     * *     *  *            *  ");
    System.out.println("  *****   *****   *        *****  ");
}
 main
