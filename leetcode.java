public class leetcode {
    public static void findIndex(int arr[], int i) {
       
        int target = 3;
        if(i==arr.length){
             return ;
        }
        if(arr[i] == target){
             System.out.println(i);
        }
        findIndex(arr, i+1);
    }
    public static void main(String[] args) {
        // int target = 3;
        int arr[]={4,5,6,7,0,1,2};
        findIndex(arr, 0);
        

    }
    
}
