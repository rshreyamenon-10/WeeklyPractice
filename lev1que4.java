public class lev1que4 {

    public static void generateException() {
        String text = null;
        text.length();
    }

    public static void handleException() {
        String text = null;
        try {
            text.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Caught an Exception: " + e.getMessage());
            System.out.println("Handling the NullPointerException successfully.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException Handling: ");
        handleException();

        System.out.println("\n Generating Unhandled NullPointerException: ");
        generateException();
    }
}