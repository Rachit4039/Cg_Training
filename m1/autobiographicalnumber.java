
public class autobiographicalnumber {
    public static void main(String[] args) {
        String s = "1210";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                c++;
            }
        }
        System.out.println(c);
    }
}
