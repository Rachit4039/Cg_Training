
public class nbaseconversion {
    public static void main(String[] args) {
        int n = 718;
        int num = 12;
        String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int t=n%num;
            sb.append(s.charAt(t));
            n=n/num;
        }

        System.out.println(sb.reverse().toString());
    }    
}
