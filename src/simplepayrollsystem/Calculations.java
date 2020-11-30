package simplepayrollsystem;

public class Calculations {

    public static double calcGrossPay(int hoursWorked, double hourlyRate){
        return hoursWorked * hourlyRate;
    }
    
    public static double calcWithHoldingTax(double grossPay, double withholdingTaxRate ){
        return grossPay * withholdingTaxRate;
    }
    
    public static double calcStateTax(double grossPay, double stateTaxWithholdingRate){
        return grossPay * stateTaxWithholdingRate;
    }
    
    public static double calcTotalDeductions(double withholdingTax, double stateTax){
        return withholdingTax + stateTax;
    }
    
    public static double calcNetPay(double grossPay, double totalDeductions){
        return grossPay - totalDeductions;
    }
}
