public class reverseString {
    public static void printReverseString(String str , int idx) {
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printReverseString(str, idx-1);
        
    }
    public static void main(String[] args) {
        String str = "abcd";
        printReverseString(str, str.length()-1);
    }
    
}
