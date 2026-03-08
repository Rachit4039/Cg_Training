
public class ratsandunits {
    public static void main(String[] args) {
        int r = 7;
        int u=2;
        int arr[] = new int[]{2,8,3,5,7,4,1,2};
        int n = arr.length;
        int s=0;
        int a=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(s>=r*2){
                a=i+1;
                break;
            }
        }
        System.out.println(a);
    }
}
