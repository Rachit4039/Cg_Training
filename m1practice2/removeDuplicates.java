import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        String s= "CsharpstarZ";
        int n = s.length();
        LinkedHashSet<Character>hs = new LinkedHashSet<>();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            hs.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for(char c :hs){
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
