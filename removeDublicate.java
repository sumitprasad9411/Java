import java.util.HashMap;
import java.util.LinkedHashMap;

public class removeDublicate {
    
    public static void main(String[] args) {
        HashMap<Integer,Integer> h1 = new LinkedHashMap<>();
        int arr[]={1,2,2,1,3,4,3,4,5,5};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (!h1.containsKey(n)) {
                h1.put(n, 1);
           }else{
               int v = h1.get(n);
               h1.put(n, v+1);
           }
        }
        System.out.println(h1);
        System.out.println(h1.keySet());

        int maxfrequency =0 ; int res =0;
        for (int key : h1.keySet()) {
            if (maxfrequency <= h1.get(key)) {
                maxfrequency = h1.get(key);
                res= key;
            }
        }
        System.out.println(res);
    }
}
