public class leetcode {
    public static int findIndex(int arr[], int i,int target) {
       
        
        if(i==arr.length){
           return -1; 
        }
        if(arr[i] == target){
             System.out.println(i);
        } 
        findIndex(arr, i+1, target);
        return -1;
    }
    public static void main(String[] args) {
        // int target = 3;
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(findIndex(arr, 0,3));
        

    }
    
}
