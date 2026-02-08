public class LicensePlateValidation {

    public static boolean isValidPlate(String plate) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return plate.matches(regex);
    }

    public static void main(String[] args) {
        String[] plates = {"AB1234", "A12345", "ab1234"};

        for (String p : plates) {
            System.out.println(p + " → " +
                    (isValidPlate(p) ? "Valid" : "Invalid"));
        }
    }
}
