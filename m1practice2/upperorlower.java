
public class upperorlower {
    public static void main(String[] args) {
        String s = "ARirgniSE";
        int n = s.length();
        int uc=0;
        int lc=0;
        for(char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                lc++;
            } else if(Character.isUpperCase(c)){
                uc++;
            }
        }
        StringBuilder sb = new StringBuilder();
            if(lc>uc){
                for(char c:s.toCharArray()){
                    sb.append(Character.toLowerCase(c));
                }
            }
            else{
                for(char c:s.toCharArray()){
                    sb.append(Character.toUpperCase(c));
                }
            }

            System.out.println(sb.toString());
    }
}
