public class SalaryWorker extends  Worker
{
    double annualSal;

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(IDNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSal = annualSalary;
    }

    public double getAnnualSal()
    {
        return annualSal;
    }

    public void setAnnualSal(double annualSal)
    {
        this.annualSal = annualSal;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        return(annualSal/52.0);
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        return ("Weekly Pay: $" + (this.calculateWeeklyPay(40)) + " *Weekly Pay is a set amount calculated using annual salary.");
    }
}
