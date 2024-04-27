//write a program to print sum of unique element array
import java.util.HashMap;
import java.util.Map;

public class prog3 {
    
    public static void sumOfUnique(int[] nums) {
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
        System.out.println("Sum of unique element is:" +sum); 
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 2, 3, 4, 4, 5 };
        sumOfUnique(nums);
    }
}


    

