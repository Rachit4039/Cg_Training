
public class exponentsoftwo {
    public static void main(String[] args) {
        int a = 7;
        int b = 12;
        int ans = Integer.MIN_VALUE;
        int aa=0;
        for(int i=a;i<=b;i++){
            if(i%2!=0){
                continue;
            }
            int f=find(i);
            if(f>ans){
                aa=i;
                ans=f;
            }
        }
        System.out.println(aa);
    }

    public static int find(int a){

        int c=0;
        while(a%2==0){
            c++;
            a=a/2;
        }
        return c;
    }
}
