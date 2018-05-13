
package collection;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(100, "ABhi");
        map.put(101,"sac");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" " +m.getValue());
        }
    }
  
}
