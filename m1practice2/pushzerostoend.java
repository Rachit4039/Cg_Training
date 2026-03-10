import java.util.*;

public class pushzerostoend {
    public static void main(String[] args) {
        int arr[] = new int[]{5,0,7,6};
        int n = arr.length;

        ArrayList<Integer>ar = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                ar.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                ar.add(arr[i]);
            }
        }
        int c=0;
        for(int a:ar){
            System.out.print(a);
            c++;
            if(c<ar.size()){
                System.out.print(" ");
            }
        }
    }
}
