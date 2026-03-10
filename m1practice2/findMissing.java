
public class findMissing {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,4,6,3,7,8};
        int n = arr.length;
        int s=0;
        for(int i:arr){
            s+=i;
        }

        int ts=0;
        for(int i=1;i<=n+1;i++){
            ts+=i;
        }
       
        System.out.println(ts-s);
    }
}
