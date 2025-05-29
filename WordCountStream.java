import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WordCountStream {


    public static void main(String[] args){
        String str="I love java, I love java, I do not hate java";

        str=str.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] list = str.split(" ");
        Arrays.stream(list).collect(Collectors.groupingBy(s->s, Collectors.counting()))
                .forEach((a,b)->System.out.println(a+" : "+b));
    }
}
