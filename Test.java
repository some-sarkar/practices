import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String... args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().reduce(2, (a,b)->a*b));;
    }



}
