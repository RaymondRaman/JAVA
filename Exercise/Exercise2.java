// Simple Calculator
class Calculator {
  // write class fields here
  private double num1;
  private double num2;

  public Calculator(double num1, double num2) {
    //write definition here
    this.num1 = num1;
    this.num2 = num2;
  }

  double add() {
    //write definition here
    return this.num1 + this.num2;
  }

  double subtract() {
    //write definition here
    return this.num2 - this.num1;
  }

  double multiply() {
    //write definition here
    return this.num1 * this.num2;
  }

  double divide() { 
    //write definition here
    return this.num2 / this.num1;
  }
  
}

class Demo {

  public static void main(String args[]) {
    Calculator obj = new Calculator(10, 94);

    System.out.println(obj.add());
    System.out.println(obj.subtract());
    System.out.println(obj.multiply());
    System.out.println(obj.divide());
  }

}

// Implement a function getDetails(String carName) 
// Derived Class
class Car extends Vehicle{ // This line needs to be changed.
  
  public String name; //  Name of a Car
  
  public Car() { // Default Constructor
    name = "";
  }
  
  // This function sets the name of the car
  public void setDetails(String name) { // Setter Function
    this.name = name;
  }
  
  // This function calls the Base class functions and appends the input to the result
  public String getDetails(String carName) { 
    String details = carName + ", " + getModel() + ", " + getSpeed();
    return details;
  }
  
}

// modify the getName() method of the derived class
// Derived Class
class XShape extends Shape { 
  
  private String name;
  
  public XShape(String name) { // Default Constructor
    this.name = name;
  }
  
  // Overridden Method
  public String getName() { 
    // write your code here
    return super.getName() + ", " + this.name;
  }
  
}

// Associate Vehicle and Its Driver
class Vehicle {
  
   // Complete this implementation
    int id;
    String model;

   public Vehicle(int id, String model) {
      this.id = id;
      this.model = model;
   }
}

class Driver{
    String driverName;
   Vehicle vehicle;
   // Complete this implementation
   public Driver(String driverName, Vehicle v) {
      this.driverName = driverName;
      vehicle = v;
   }
  
}

class Main {
  
   public static void main(String args[]) {
	    // Write your code here
      Vehicle vehicle = new Vehicle(4453, "Volvo S60");
       Driver John = new Driver("John", vehicle);
       System.out.println(John.driverName + " is a driver of car Id: " + John.vehicle.id);
   }
  
}
