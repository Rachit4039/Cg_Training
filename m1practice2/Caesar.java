
public class Caesar {
    public static void main(String[] args) {
        String s ="nrfzh";
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='y'){
                sb.append('b');
            }
            else if(c=='z'){
                sb.append('c');
            }
            else if(c=='x'){
                sb.append('a');
            }
            
            else{
                sb.append((char)(c+3));
            }
        }
        System.out.println(sb.toString());
    }
}
