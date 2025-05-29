import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCaseStrintStream {

    public  static void main(String[] args){

        List<String> list = Arrays.asList("ram", "shyam", "suman");

        List<String> newList= list.stream().map(x->x.toUpperCase()).toList();
        System.out.println(newList);




    }
}
