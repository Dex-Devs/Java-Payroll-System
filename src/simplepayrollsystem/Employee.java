package simplepayrollsystem;

public class Employee {
     
    // employee attributes
    private String empName;
    private double hourlyPayRate, withHoldingTaxRate, stateTaxRate;
    private int noOfHoursPerWeek;
    
    // constructor 
    public Employee(String name, int noOfHrs, double hourlyPay, double withHoldingTax, double stateTax ){
        this.empName = name;
        this.noOfHoursPerWeek = noOfHrs;
        this.hourlyPayRate = hourlyPay;
        this.withHoldingTaxRate = withHoldingTax;
        this.stateTaxRate = stateTax;
    }


    public String getEmpName() {
        return empName;
    }

    public int getNoOfHoursPerWeek() {
        return noOfHoursPerWeek;
    }
     
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getWithHoldingTax() {
        return withHoldingTaxRate;
    }

    public double getStateTax() {
        return stateTaxRate;
    }
    
    
     
}
