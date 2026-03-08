
public class OperationChoices {
    public static void main(String[] args) {
        int a =12;
        int b=16;
        int c=1;

        switch(c){
            case 1: {
                System.out.println(a+b);
                break;
            }
            case 2: {
                System.out.println(a-b);
                break;

            }
            case 3: {
                System.out.println(a*b);
                break;

            }
            case 4: {
                System.out.println(a/b);
                break;

            }
            default:{
                System.out.println(0);
            }
            
        }
    }
}
