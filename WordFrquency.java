import java.util.HashMap;
import java.util.LinkedHashMap;

class HelperWordFrequency{
    public static void wordFrequency(String str){
        str = str.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] newStr = str.split(" ");
        HashMap<String, Integer> result = new LinkedHashMap<>();
        int l = newStr.length;
        for(int i=0; i<l; i++){
            result.put(newStr[i], result.getOrDefault(newStr[i], 0 )+1);
        }

        for(String ss: result.keySet()){
            System.out.println(ss+" : "+result.get(ss));
        }
    }
}


public class WordFrquency {
    public static void main(String[] args){
        HelperWordFrequency.wordFrequency("Java is good, I love java. Java is strong, I am strong");
    }
}
