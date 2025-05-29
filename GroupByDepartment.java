import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
    private String name;
    private String department;


    String getDepartment(){
        return this.department;
    }
    Person() {}

    Person(String name, String department){
        this.name=name;
        this.department=department;
    }

    @Override
    public String toString() {
        return name;
    }
}


public class GroupByDepartment {

    public static void main(String[] args){
        Person p1 = new Person("A", "CSE");
        Person p2 = new Person("B", "EC");
        Person p3 = new Person("C", "CIVIL");
        Person p4 = new Person("D", "CSE");
        Person p5 = new Person("E", "CSE");
        Person p6 = new Person("F", "EC");
        Person p7 = new Person("G", "EC");
        Person p8 = new Person("H", "CIVIL");
        Person p9 = new Person("I", "CIVIL");
        Person p10 = new Person("J", "IT");
        Person p11 = new Person("K", "EC");

        List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
        Map<String, List<Person>> listMap;
        listMap = persons.stream().collect(Collectors.groupingBy(Person::getDepartment));
        System.out.println(listMap);
    }



}
