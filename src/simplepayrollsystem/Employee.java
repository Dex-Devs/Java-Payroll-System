package simplepayrollsystem;

public class Employee {
     
    // id counter --- FOR AUTO INCREMENTING
    static int empIDCounter = 0;
    
    // employee attributes
    private String empName;
    private double hourlyPayRate;
    private int noOfHoursPerWeek, empID;
    
    // constructor 
    public Employee(String name, int noOfHrs, double hourlyPay ){
        empIDCounter = empIDCounter + 1;
        this.empID = empIDCounter;  
        this.empName = name;
        this.noOfHoursPerWeek = noOfHrs;
        this.hourlyPayRate = hourlyPay;
    }

    public int getEmpID() {
        return empID;
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
     
}
