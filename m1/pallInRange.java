
public class pallInRange {
    public static void main(String[] args) {
        int a = 10;
        int b = 80;

        for(int i=a;i<=b;i++){
            String s = Integer.toString(i);
            if(isPal(s)){
                System.out.println(i);
            }
        }
    }

    static boolean isPal(String s){
        int b = s.length()-1;
        int a = 0;

        while(a<b){
            if(s.charAt(b)!=s.charAt(a)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
