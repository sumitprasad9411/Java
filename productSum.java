public class productSum {

    static int product(int arr[]){
         for(int i=0;i<arr.length;i++){
            int p =1;
             for(int j =i+1; j<arr.length;j++){
                if(i!=j){
                    p*arr[i];
                }
             }
         }
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,1};
        product(arr);

    }
}


