import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateCharStringStream {

    public static void main(String[] args){
        String str = "I love java, java is good";
        HashSet<Character> set = new LinkedHashSet();
        String result = str.chars()
                .mapToObj(c->(char) c)
                .filter(x->set.add(x))
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream().map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);;
    }




}
