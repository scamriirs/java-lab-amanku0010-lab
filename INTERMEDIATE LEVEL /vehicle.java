class Vehicle {
    String vehicle_type;

    
    Vehicle(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

   
    void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}

class Car extends Vehicle {
    String model_type;
    String company_name;

   
    Car(String vehicle_type, String model_type, String company_name) {
        super(vehicle_type);   // calling super class constructor
        this.model_type = model_type;
        this.company_name = company_name;
    }

   
    void display() {
        super.display();  // calling parent class display()
        System.out.println("Company Name: " + company_name);
        System.out.println("Model Type : " + model_type);
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Four Wheeler", "Sedan", "Honda");

        System.out.println("=== Vehicle Information ===");
        c1.display();
    }
}
