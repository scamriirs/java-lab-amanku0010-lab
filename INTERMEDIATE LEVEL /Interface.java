interface Result {
    double calculatePercentage();
    void displayResult();
}

class Student implements Result {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculatePercentage() {
        int total = 0;
        for(int m : marks) {
            total += m;
        }
        return (total / (double)(marks.length * 100)) * 100;
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Marks:");
        for(int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Percentage: " + calculatePercentage());
        if(calculatePercentage() >= 40)
            System.out.println("Status: PASS");
        else
            System.out.println("Status: FAIL");
    }
}

public class Main {
    public static void main(String[] args) {
        int[] marks = {85, 78, 90, 88, 76};
        Student s = new Student("Aman Kumar", marks);
        s.displayResult();
    }
}
