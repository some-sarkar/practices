import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test10 {
    public  static void main(String[] args){
//        String str = "I am Someshwar Sarkar Sarkar";
//
//        String[] s = str.split(" ");
//
//        HashMap<String, Integer> freq = new HashMap<>();
//        for (String x : s){
//            freq.put(x, freq.getOrDefault(x, 0)+1);
//        }
//        System.out.println(freq);

        //int[] arr = {55 , 41,-54,2,-33,10,-11,45};
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        int tmp;
//        for(int i=0; i<arr.length-1; i++){
//            if(i%2!=0 && arr[i]<0 & arr[i+1]<0){
//                tmp=arr[i];
//                arr[i]=arr[i+1];
//                arr[i]=tmp;
//            }
//
//    }
//        for(int j=0; j<arr.length; j++){
//            System.out.println(arr[j]);
//        }
        List<Integer> l1 =Arrays.stream(arr).filter(x->x<0).collect(Collectors.toList(List::new));
        Arrays.stream(arr).filter(x->x>0).forEach(System.out::println);


   // 55,41,-54,2,-33,10,-11,45
        // 55 , -54, 41,-33,2,-11,10,45


    }
}
