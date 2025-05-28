class Helper{
//    public static String reverseString(String s){
//        if(s.isEmpty()){
//            return "Empty or Null value";
//        }
//
//        int start = 0;
//        int end = s.length()-1;
//        char tmp;
//        StringBuilder result = new StringBuilder(s);
//        while(start<end){
//            tmp = result.charAt(start);
//            result.setCharAt(start, result.charAt(end));
//            result.setCharAt(end, tmp);
//
//
//            start++;
//            end--;
//        }
//        return result.toString();
//    }

    public static String reverseString(String s){
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        char tmp;
        while(start<end){
            tmp = chars[start];
            chars[start]=chars[end];
            chars[end]=tmp;
            start++;
            end--;
        }
        return new String(chars);
    }
}

public class ReverseString {

    public static void main(String []args){
        System.out.println(Helper.reverseString("JAVA"));
    }


}
