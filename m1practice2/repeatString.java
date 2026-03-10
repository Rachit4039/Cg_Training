public class repeatString {
    public static void main(String[] args) {
        int n =3;
        String a = "abc";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(a);
        }
        System.out.println(sb.toString());
    }    
}
