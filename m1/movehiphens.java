
public class movehiphens {
    public static void main(String[] args) {
        String s ="Move-Hyphens-to-Front";
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='-'){
                sb.append(s.charAt(i));
            }
        }

        for(int i=0;i<n;i++){
            if(s.charAt(i)!='-'){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
