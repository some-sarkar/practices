import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestMarks {

    public static void main(String[] args){
        Student s1 = new Student("suman", 50);
        Student s2 = new Student("some", 30);
        Student s3 = new Student("debajit", 50);
        Student s4 = new Student("anjan", 80);
        Student s5 = new Student("sayan", 80);
        Student s6 = new Student("someshwar", 90);

        List<Student> studentList = Arrays.asList(s1,s2,s3,s4,s5,s6);

        Optional<Integer> secondHighest = studentList.stream()
                .map(s->s.getMarks())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighest.ifPresent(
                mark->{
                    studentList.stream()
                            .filter(s->s.getMarks() == mark)
                            .forEach(s-> System.out.println(s.toString()));
                }
        );

    }




}
