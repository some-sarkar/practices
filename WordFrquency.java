import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

class HelperWordFrequency{
    public static void wordFrequency(String str){
        str = str.toLowerCase().replaceAll("[^a-z\\s]", "");
        System.out.println(str);
        String[] newStr = str.split(" ");
        HashMap<String, Integer> result = new LinkedHashMap<>();
        int l = newStr.length;
        for(int i=0; i<l; i++){
            result.put(newStr[i], result.getOrDefault(newStr[i], 0 )+1);
        }

        for(String ss: result.keySet()){
            System.out.println(ss+" : "+result.get(ss));
        }

        String firstMaxOxurringWord = "";
        int firstMaxCount = 0;

        for(String s: result.keySet()){
            if(result.get(s)>firstMaxCount){
                firstMaxCount=result.get(s);
                firstMaxOxurringWord=s;
            }
        }
        System.out.println("first max occ "+firstMaxOxurringWord);
    }
}


public class WordFrquency {
    public static void main(String[] args){
        HelperWordFrequency.wordFrequency("Java is is good, I love java. Java is strong, I am strong I I I I I I I I I I");
    }
}
