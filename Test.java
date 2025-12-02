import java.util.*;
import java.util.stream.Collectors;

interface A{

    public default void show(){
        System.out.println("interface");
    }
}
abstract class B{
    public void show(){
        System.out.println("abstract");
    }
}



public class Test extends  B implements A {


    public static  void main(String... args){
        Test t = new Test();
        t.show();
    }



}
