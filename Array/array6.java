public class array6 {
    //find first largest element
    public static int FirstLargestElement(int arr[]){
        int mx =Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
             if(arr[i]>mx){
                mx=arr[i];
             }

        }
        return mx;
        
    }
   
    public static int SecondLargestElement(int arr[]) {
        int mx = FirstLargestElement(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
         //Find second largest element
        int SecondLargestElement=FirstLargestElement(arr);
        return SecondLargestElement;   
    }
    public static void main(String[] args) {
        int arr[]={7,6,2,7,1,7};
        System.out.print("Second largest element:" +SecondLargestElement(arr));
        //int mx=Integer.MIN_VALUE;
        //SecondLargestElement(arr);
        
        
        
    }
    
}
