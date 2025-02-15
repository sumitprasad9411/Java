public class uniquenum {

    public static void main(String[] args) {
        int arr[]={9,9,7,6,7,6,4,5,4,5,1};
        int result =0;
        for(int i=0; i<arr.length;i++){
            result = result^arr[i];

        }
        System.out.println("Uniqued number "+ result);
    }
}
