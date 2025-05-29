import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" : "+ marks;
    }
}


public class RangeMarksStudentStream {

   public static void main(String[] args){

       Student s1 = new Student("suman", 50);
       Student s2 = new Student("some", 30);
       Student s3 = new Student("debajit", 25);
       Student s4 = new Student("anjan", 70);
       Student s5 = new Student("sayan", 80);
       Student s6 = new Student("someshwar", 90);

       List<Student> studentList = Arrays.asList(s1,s2,s3,s4,s5,s6);


       studentList.stream()
               .filter(s-> s.getMarks()>=30 && s.getMarks()<=80)
               .forEach(System.out::println);
   }


}
