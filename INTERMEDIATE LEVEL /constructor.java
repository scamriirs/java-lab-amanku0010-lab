class Student {
    String name;
    int age;

    
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor Called");
    }

   
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("---------------------------");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {     
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Aman", 21);
        s2.display();
    }
}
