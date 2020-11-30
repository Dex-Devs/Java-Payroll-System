package simplepayrollsystem;

public class Calculations {
    static double withholdingTaxRate, stateTaxWithholdingRate;
    
    public Calculations(double wtr, double stwr){
        Calculations.withholdingTaxRate = wtr;
        Calculations.stateTaxWithholdingRate = stwr;
    }
    
    public static double calcGrossPay(int hoursWorked, double hourlyRate){
        return hoursWorked * hourlyRate;
    }
    
    public static double calcWithHoldingTax(double grossPay){
        return grossPay * Calculations.withholdingTaxRate;
    }
    
    public static double calcStateTax(double grossPay){
        return grossPay * Calculations.stateTaxWithholdingRate;
    }
    
    public static double calcTotalDeductions(double withholdingTax, double stateTax){
        return withholdingTax + stateTax;
    }
    
    public static double calcNetPay(double grossPay, double totalDeductions){
        return grossPay - totalDeductions;
    }
}
