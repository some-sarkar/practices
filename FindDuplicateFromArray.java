import java.util.*;

public class FindDuplicateFromArray {
    public static void main(String[] args){
        int[] list = new int[]{1,4,5,2,5,78,4,3,1,3,4};

        HashSet<Integer> result = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();

        for(Integer i: list){
            if(!set.add(i)){
                result.add(i);
            }
        }

        System.out.println(result);

    }
}
