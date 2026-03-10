
public class reverseOrder {
    public static void main(String[] args) {
        int n = 230540000;
        String t = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        sb.append(t);
        sb.reverse();
        boolean f =true;
        for(int i =0;i<sb.length();i++){
            while(sb.charAt(i)=='0' && f){
                sb.deleteCharAt(i);
            }
            f=false;
        }

        System.out.println(sb.toString());
    }
}
