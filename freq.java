import java.util.HashMap;
import java.util.Map;

public class freq {
    public static void main(String[] args) {
      String s1= "iamsumitprasad";
      HashMap<Character,Integer> m1= new HashMap<>();
            System.out.println(m1);
      for(int i=0; i<s1.length();i++){
        char c= s1.charAt(i);
        if (m1.containsKey(c)) {
            m1.put(c, m1.get(c)+1);
        }else{
            m1.put(c,1);
        }
        System.out.println(m1);
      }

      System.out.println(m1);

    //   for (char  key : m1.keySet()) {
    //     System.out.println(" value of "+ key + " value= " + m1.get(key));
    //   }
    }
}
