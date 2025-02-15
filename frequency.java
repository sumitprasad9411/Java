import java.security.Key;
import java.util.HashMap;

public class frequency {
    HashMap<Character,Integer> h1 = new HashMap<>();
    public static void main(String[] args) {
        frequency obj = new frequency();
        String ch = "ccaattsp";
        for(int i=0; i< ch.length(); i++){
            char str = ch.charAt(i);
            if (!obj.h1.containsKey(str)) {
                 obj.h1.put(str, 1);
            }else{
                int v = obj.h1.get(str);
                obj.h1.put(str, v+1);
            }
        }
        System.out.println(obj.h1);
    }
}
