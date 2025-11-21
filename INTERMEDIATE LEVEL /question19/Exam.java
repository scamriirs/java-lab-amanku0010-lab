package exam;

import student.Student;

public class Result {
    private Student student;
    private int[] marks;

    public Result(Student student, int[] marks) {
        this.student = student;
        this.marks = marks;
    }

    public void displayMarkSheet() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double percentage = (double) total / marks.length;
        System.out.println("Mark Sheet");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
