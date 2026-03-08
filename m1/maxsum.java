
public class maxsum {
    public static void main(String[] args) {
        int arr[] = new int[]{2,5,6,4};
        int n = arr.length;
        int s=12;
        int a=0;
        for(int i=0;i<n-1;i++){
            int ms=0;
            for(int j=i+1;j<n;j++){
                ms=arr[i]+arr[j];
                if(ms<s && ms>a){
                    a=ms;
                }
            }
        }
        System.out.println(a);
    }
}
