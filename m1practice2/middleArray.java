import java.util.*;

public class middleArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,-2,3,-4,5,6};
        int n = arr.length;
        ArrayList<Integer>ar = new ArrayList<>();
        for(int i:arr){
            if(i>0){
                ar.add(i);
            }
        }
        
        int a=ar.size();
        int ans = 0;
        if(a%2==0){
            ans=ar.get(a/2 -1);
        }
        else{

            ans = ar.get(a/2);
        }
        System.out.println(ans);
    }
}
