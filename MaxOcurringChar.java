import java.util.HashMap;

public class MaxOcurringChar {

    public  static void main(String[] args){

        String str="i i i i love java";
        int maxCount=0;
        char maxChar='\0';
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch: str.toCharArray()){
            if(ch == ' ')
                continue;

            map.put(ch, map.getOrDefault(ch, 0)+1);

            if(map.get(ch)>maxCount){
                maxCount=map.get(ch);
                maxChar=ch;
            }

        }
        System.out.println("Max Ocurring character: \""+maxChar+"\" repeated "+maxCount+" times");
    }
}
