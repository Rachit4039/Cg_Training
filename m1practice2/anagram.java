
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String a = "dfgubli";
        String b= "bufidld";

        if(a.length()!=b.length()){
            System.out.println("no");
            return ;
        }
        char arr[] = a.toCharArray(); 
        char arr2[] = b.toCharArray();
        Arrays.sort(arr);       
        Arrays.sort(arr2); 
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
