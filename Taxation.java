package taxation;
import java.util.Scanner;
//package and class declaration
    // starting point of the program
public class Taxation {
    public static void main(String[] args) {
        // create a new Scanner object, named keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //Getting input from user: Total income, Deductions and Allowance
        System.out.print("Total Income: $");
        double totalIncome = keyboard.nextDouble();
        if(totalIncome < 0)
        {
            System.out.print("Invalid input!\n");
            System.exit(0);
        }
        
        System.out.print("Deductions  : $");
        double deductions = keyboard.nextDouble();
        if(deductions < 0)
        {
            System.out.print("Invalid input!\n");
            System.exit(0);
        }
        
        System.out.print("Allowance   : $");
        double Allowance = keyboard.nextDouble();
        if(Allowance < 0)
        {
            System.out.print("Invalid input!\n");
            System.exit(0);
        }
            
        
        double netChargeableIncome = totalIncome - deductions - Allowance;
        double netIncome = totalIncome - deductions;
        
        //Change netChargeableIncome/netIncome to zero if it is a negative number
        if(netChargeableIncome < 0)
        {
            netChargeableIncome = 0;
        }
        if(netIncome < 0)
        {
            netIncome = 0;
        }
        
        double standardTax = netIncome * 0.15;
        double progressTax;
        
        //Caculating the amount of progressTax for different income group
        if(netChargeableIncome <= 50000)
        {
            progressTax = netChargeableIncome * 0.02;
        }else if(netChargeableIncome > 50000 && netChargeableIncome <= 100000){
            progressTax = 1000 + (netChargeableIncome - 50000 ) * 0.06;
        }else if(netChargeableIncome > 100000 && netChargeableIncome <= 150000){
            progressTax = 4000 + (netChargeableIncome - 100000) * 0.01;
        }else if(netChargeableIncome > 150000 && netChargeableIncome <= 200000){
            progressTax = 9000 + (netChargeableIncome - 150000) * 0.14;
        }else{
            progressTax = 16000 +(netChargeableIncome - 200000) * 0.17;
        }
        
        System.out.print("Progressive Tax = $" + progressTax + "\n");        
        System.out.print("Standard Tax    = $" + standardTax + "\n");
        
        double amountOfsalariesTax;
        //Compare progressTax and standTax, get the one with the lower amount
        if(progressTax <= standardTax){
            amountOfsalariesTax = progressTax;
        }else{
            amountOfsalariesTax = standardTax;
        }
        
        System.out.print("Amount of Salaries Tax = $" + amountOfsalariesTax +"\n");
        
        //Reduction of tax if greater or equal to $10,000
        double answer = amountOfsalariesTax;
        if(amountOfsalariesTax >= 10000)
        {
            answer = amountOfsalariesTax - 10000;
        }
        
        System.out.print("Final Salareis Tax Payable = $");
        System.out.printf("%.1f\n", answer);
    }
}
