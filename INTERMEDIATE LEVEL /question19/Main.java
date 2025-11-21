import student.Student;
import exam.Result;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 101);
        int[] marks = {85, 90, 78, 88, 92};
        Result r1 = new Result(s1, marks);
        r1.displayMarkSheet();
    }
}
