package simplepayrollsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Runner {
    
    public static void drawTitle(){
        System.out.println("========================================"
                + "\n======       PAYROLL SYSTEM       ======" 
                + "\n========================================");
    }
    
    public static void main(String args[]){
        drawTitle();
        
        String name = null;
        int hoursWorked = 0,withholdingTax = 0, stateTax = 0;
        double hourlyRate = 0.0;
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            
            System.out.print("Employee's Full Name: ");
            name = br.readLine();
            
            System.out.println("Number of Hours worked in a week: ");
            hoursWorked = Integer.parseInt(br.readLine());
            
            System.out.println("Hourly Pay Rate: ");
            hourlyRate = Double.parseDouble(br.readLine());
            
            System.out.println("Withholding Tax Rate: ");
            withholdingTax = Integer.parseInt(br.readLine());
            
            System.out.println("State Tax Withholding Rate: ");
            stateTax = Integer.parseInt(br.readLine());
            
        } catch (IOException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // create instances of class Employee and Calculations
        Employee emp = new Employee(name, hoursWorked, hourlyRate);
        Calculations calc = new Calculations(withholdingTax/100, stateTax/100);
        
        
        
    }
}
