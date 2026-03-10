import java.util.*;

public class maxOccuringChar {
    public static void main(String[] args) {
        String a ="abodd";
        int n = a.length();
        HashMap<Character,Integer>hs = new HashMap<>();
        for(int i=0;i<n;i++){
            char c = a.charAt(i);
            hs.put(c,hs.getOrDefault(c, 0)+1);
        }

        int m=0;
        char ct='a';
        for(Map.Entry<Character,Integer>entry:hs.entrySet()){
            if(m<entry.getValue()){
                m=entry.getValue();
                ct= entry.getKey();
            }
        }
        System.out.println(ct);
    }
}
