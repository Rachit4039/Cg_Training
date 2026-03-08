public class SecondLargestSum{
    public static void main(String[] args) {
        int arr[] = new int[]{3,2,1,7,5,4};
        int n =arr.length;
        
        if(n<3){
            System.out.println(0);
            return;
        }

        int esl=0;
        int el=0;
        int ol=0;
        int osl=0;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(el<arr[i]){
                    esl=el;
                    el=arr[i];
                }
                else if(esl<arr[i] && arr[i]<el){
                    esl=arr[i];
                }
            }
            else{
                if(ol<arr[i]){
                    osl=ol;
                    ol=arr[i];
                }
                else if(osl<arr[i] && arr[i]<ol){
                    osl=arr[i];
                }
            }
        }

        System.out.println(esl+osl);
    }
}
