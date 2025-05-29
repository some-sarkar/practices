import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


class HelperRemoveDuplicateStringList{
    static List<String> removeDuplicate(List<String> list){
        HashSet<String> set = new LinkedHashSet<>();
        for (String s: list){
            set.add(s);
        }
        return set.stream().toList();
    }
}

public class RemoveDuplicateStringList {
    public static void main(String[] args){
        List<String> list = Arrays.asList("I", "love", "Java","I", "love", "Java","I", "love", "Java");
        //System.out.println(HelperRemoveDuplicateStringList.removeDuplicate(list));
        HashSet<String> set = new LinkedHashSet<>(list);
        System.out.println(set.stream().toList());
    }
}
