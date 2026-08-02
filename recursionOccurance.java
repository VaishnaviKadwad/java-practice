public class recursionOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String str, int idx, char element){
        if (idx==str.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(element == str.charAt(idx)){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }findOcc(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "aabbccddaabb";
        int idx = 0;
        char element = 'a';
        findOcc(str, idx, element);

    }
    
}
