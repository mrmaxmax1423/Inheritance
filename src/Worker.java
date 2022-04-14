public class Worker extends Person
{
    double hourlyPayRt;

    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRt = hourlyPayRate;
    }

    //create a worker using an existing person and an hourlyPayRate
    public Worker(Person person, double hourlyRt){
        super(person.getIDNum(),
            person.getFirstName(),
            person.getLastName(),
            person.getTitle(),
            person.getYOB());
        this.hourlyPayRt = hourlyRt;
    }

    public double getHourlyRate()
    {
        return hourlyPayRt;
    }

    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyPayRt = hourlyRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double payTotal;
        if(hoursWorked <= 40)
        {
            return (hoursWorked * hourlyPayRt);
        }
        else
        {
            return (calculateWeeklyPay(40) + (hourlyPayRt * 1.5) * (hoursWorked - 40));
        }
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        if(hoursWorked <= 40)
        {
            return (hoursWorked + " Hours at hourly rate. Total Pay: $" + (hoursWorked * hourlyPayRt));
        }
        else
        {
            return ("40 Hours at hourly rate, " + (hoursWorked - 40) + " hours at time and a half. Total Pay: $"+ (calculateWeeklyPay(40) + (hourlyPayRt * 1.5) * (hoursWorked - 40)));
        }
    }
}
