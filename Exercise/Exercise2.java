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
