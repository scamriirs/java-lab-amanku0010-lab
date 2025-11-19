class Student {
    String name;
    int age;
    static String collegeName = "ABC College";

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("College: " + collegeName);
        System.out.println("-----------------------------");
    }

    static void changeCollege(String newCollege) {
        collegeName = newCollege;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 21);
        Student s2 = new Student("Rahul", 22);

        s1.display();
        s2.display();

        Student.changeCollege("XYZ University");

        System.out.println("After changing college name:\n");

        s1.display();
        s2.display();
    }
}
