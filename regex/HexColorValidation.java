public class HexColorValidation {

    public static boolean isValidHexColor(String color) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return color.matches(regex);
    }

    public static void main(String[] args) {
        String[] colors = {"#FFA500", "#ff4500", "#123"};

        for (String c : colors) {
            System.out.println(c + " → " +
                    (isValidHexColor(c) ? "Valid" : "Invalid"));
        }
    }
}
