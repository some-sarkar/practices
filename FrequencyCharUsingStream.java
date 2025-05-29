import java.util.stream.Collectors;

public class FrequencyCharUsingStream {


    public static void main(String[] args){
        String str= "i love java, i love java, i do not hate java";


        str.chars()
                .mapToObj(c -> (char) c)
                .filter(c-> c!=' ' && c!='.' && c!=',')
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .forEach((a,b) -> System.out.println(a +" : "+b));
    }
}
