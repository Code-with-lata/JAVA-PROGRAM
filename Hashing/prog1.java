import java.util.HashMap;
import java.util.Map;

public class prog1 {
    public static void main(String[] args) {
        //TODO Auto_generated method stub
        Map<Integer,Integer>map = new HashMap<>();
        //how to put the value in hashMap
        map.put(1,1);
        map.put(2,4);
        map.put(3,9);
        //for update the value also used put
        map.put(2,90);
        //get method is used yo find the value
        int val = map.getOrDefault(12, 0);
        
        System.out.println(map);
        
    }

    
}
