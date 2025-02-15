import java.util.Scanner;

public class rotate {

    static void rightShift(int arr[], int count){
        while (count>0) {
            int n = arr.length;
            int last = arr[n-1];
            
            for(int i = n-1; i > 0; i--) {
               arr[i] = arr[i-1];
            }
            
            arr[0] = last;
            
            for(int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
            }
            System.out.println();
            
            count --;
        }
        
        
    }
    static void rightShift(int arr[]) {
       int n = arr.length;
       int last = arr[n-1];
       
       for(int i = n-1; i > 0; i--) {
          arr[i] = arr[i-1];
       }
       
       arr[0] = last;
       
       for(int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
       }
       System.out.println();
    }

    static void leftShift(int arr[]){
        int n = arr.length;
        int first = arr[0];
        
        for(int i =0; i<n-1; i++){
            arr[i]=arr[i+1];
        }
        

        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print(first + " ");
     
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotation : ");
        int count= sc.nextInt();
        // leftShift(arr);
        rightShift(arr,count);
        rightShift(arr);
    }
}
