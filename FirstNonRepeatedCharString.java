import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class HelperRepeatChar{
    public static Character findNonRepeatedChar(String str){
        int i=0;
        HashMap<Character, Integer> result = new LinkedHashMap<>();
//        while(i<str.length()){
//            //int frequency=1;
//            if(result.containsKey(str.charAt(i))){
//                result.put(str.charAt(i), (result.get(str.charAt(i)))  +  1  );
//            }
//            else {
//                result.put(str.charAt(i), 1);
//            }
//
//            i++;
//        }

        for(Character ch: str.toCharArray()){
            result.put(ch, result.getOrDefault(ch, 0)+1);
        }

        for(Character ch: result.keySet()){
            if(result.get(ch) == 1)
                return ch;
        }



        return null;
    }
}



public class FirstNonRepeatedCharString {
    public static void main(String []args){
        System.out.println(HelperRepeatChar.findNonRepeatedChar("JJavva is good"));
    }
}
