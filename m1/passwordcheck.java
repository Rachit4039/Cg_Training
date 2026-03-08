public class passwordcheck {
    public static void main(String[] args) {
        String  s= "a/1_67";

        String pattern = "^(?=.*[A-Z])(?=.*[0-9])[^0-9][^/]{3,}$";

        if(s.matches(pattern)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
