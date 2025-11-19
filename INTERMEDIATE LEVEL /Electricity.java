import java.util.Scanner;

// Parent class
class Customer {
    String name;
    int customerId;

    // Constructor
    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

// Child class (Inheritance)
class ElectricityBill extends Customer {
    int units;

    // Constructor
    ElectricityBill(String name, int customerId, int units) {
        super(name, customerId);
        this.units = units;
    }

    double calculateBill() {
        double amount;

        if (units <= 100) {
            amount = units * 5;               // ₹5 per unit
        } else if (units <= 300) {
            amount = 100 * 5 + (units - 100) * 7; // ₹7 per unit for next 200
        } else {
            amount = 100 * 5 + 200 * 7 + (units - 300) * 10; // ₹10 per unit after 300
        }

        return amount;
    }

    void displayBill() {
        displayCustomer();
        System.out.println("Units consumed: " + units);
        System.out.println("Total Bill Amount: ₹" + calculateBill());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        // Creating object of derived class
        ElectricityBill bill = new ElectricityBill(name, id, units);

        System.out.println("\n----- Electricity Bill -----");
        bill.displayBill();
    }
}
