import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicatesinarray {
    public static void main(String[] args) {
        int arr[] = new int[]{11,11,11,12,12,3};
        int n = arr.length;
        LinkedHashSet<Integer>hs = new LinkedHashSet<>();

        for(int i=0;i<n;i++){
            int c = arr[i];
            hs.add(c);
        }

        int ans[] = new int[hs.size()];
        int id=0;
        for(int c :hs){
            ans[id++]=c;
        }

        System.out.println(Arrays.toString(ans));
    }   
}
