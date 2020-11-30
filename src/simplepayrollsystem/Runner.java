package simplepayrollsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


public class Runner {
   
    public static void main(String args[]){
        
        System.out.println("========================================"
                + "\n======       PAYROLL SYSTEM       ======" 
                + "\n========================================");
        
        String name = null;
        int hoursWorked = 0;
        double hourlyRate = 0.0, withholdingTaxRate = 0.0, stateTaxRate = 0.0;
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            
            System.out.print("Employee's Full Name: ");
            name = br.readLine();
            
            System.out.print("Number of Hours worked in a week: ");
            hoursWorked = Integer.parseInt(br.readLine());
            
            System.out.print("Hourly Pay Rate: ");
            hourlyRate = Double.parseDouble(br.readLine());
            
            System.out.print("Withholding Tax Rate (%): ");
            withholdingTaxRate = Double.parseDouble(br.readLine());
            
            System.out.print("State Tax Withholding Rate (%): ");
            stateTaxRate = Double.parseDouble(br.readLine());
            
        } catch (IOException | NumberFormatException ex) { 
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(withholdingTaxRate/100);
        System.out.println(stateTaxRate/100);
        
        // create instance of class Employee
        Employee emp = new Employee(name, hoursWorked, hourlyRate, withholdingTaxRate/100, stateTaxRate/100);
        
        double grossPay = Calculations.calcGrossPay(emp.getNoOfHoursPerWeek(), emp.getHourlyPayRate());
        double withHoldingTax = Calculations.calcWithHoldingTax(grossPay, emp.getWithHoldingTax());
        double stateTax = Calculations.calcStateTax(grossPay, emp.getStateTax());
        double totalDeduction = Calculations.calcTotalDeductions(withHoldingTax, stateTax);
        double netPay = Calculations.calcNetPay(grossPay, totalDeduction);
        
        String information = "Employee's Full Name: " + emp.getEmpName() + "\nNumbers of Hours worked in a week: " + 
                    emp.getNoOfHoursPerWeek() + "\nHourly Rate: $" + emp.getHourlyPayRate() + "\nGross Pay: " + 
                    String.format("$%.2f", grossPay) + "\n\nDeductions: \nFederal Tax withholding Rate ("
                    + withholdingTaxRate + "%): " + String.format("$%.2f", withHoldingTax) + "\nState Tax withholding Rate (" + stateTaxRate +
                    "%): $" + stateTax + "\nTotal Deduction: " + String.format("$%.2f", totalDeduction) + "\nNet Pay: " + String.format("$%.2f", netPay);
        
        JOptionPane.showMessageDialog(null, information, "Payroll Statement", JOptionPane.INFORMATION_MESSAGE);
    }
}
