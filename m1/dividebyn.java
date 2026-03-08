
public class dividebyn {
    public static void main(String[] args) {
        int n = 4;
        int m = 20;

        int d=0;
        int nd= 0;

        for(int i=1;i<=m;i++){
            if(i%n==0){
                d+=i;
            }
            else{
                nd+=i;
            }
        }

        System.out.println(Math.abs(d-nd));
    }
}
