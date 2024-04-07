//How to find the frequency in the Hashmap
import java.util.HashMap;
import java.util.Map;

public class prog2 {
    public static void main(String[] args) {
        int [] arr ={1,2,2,1,4,3,2,1,2,1,6,9,6};
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1); //through this line we find the frequency in hashmap
   }
   System.out.println(map);
    }
    
}
