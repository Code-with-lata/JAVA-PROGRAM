import java.util.HashMap;
import java.util.Map;

public class pror3 {
    
    public int sumOfUnique(int[] nums) {
       int sum =0;
       Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1); //through this line we find the frequency in hashmap
        } 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;

    }
    
}


    

