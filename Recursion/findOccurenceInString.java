public class findOccurenceInString {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx ,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char CurrentChar = str.charAt(idx);
        if( CurrentChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last =  idx;
            }
            findOccurence(str, idx+1, element);
        }
    }
    public static void main(String args[]){
        String str = "abcadbaeda";
        findOccurence(str, 0, 'a');
    }
}
