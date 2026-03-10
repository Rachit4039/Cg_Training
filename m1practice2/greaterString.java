
public class greaterString {
    public static void main(String[] args) {
        String s= "internationalization";
        int n = s.length();
        // System.out.println(n);
        if(n<10){
            System.out.println(s);
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(s.length()-2);
        sb.append(s.charAt(n-1));
        System.out.println(sb.toString());
    }
}
