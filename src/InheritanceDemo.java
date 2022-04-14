import java.util.ArrayList;

public class InheritanceDemo
{
    public static void main(String[] args)
    {

        ArrayList<Worker> workers = new ArrayList<Worker>();
        Worker employee1, employee2, employee3;
        SalaryWorker employee4, employee5, employee6;

        employee1 = new Worker("000001", "Alex", "Smith", "Mr.", 1995, 25.0);
        employee2 = new Worker("000002", "Susan", "Anderson", "Mrs.", 1999, 32.50);
        employee3 = new Worker("000003", "Jake", "Henry", "Mr.", 1990, 35.0);

        employee4 = new SalaryWorker("000004", "Gage", "Johnson", "Mr.", 1995, 25.0, 52000.0);
        employee5 = new SalaryWorker("000005", "Alex", "Miller", "Mr.", 1995, 35.0, 72800.0);
        employee6 = new SalaryWorker("000006", "Alison", "Williams", "Mrs.", 1995, 40.0, 83200.0);

        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);
        workers.add(employee4);
        workers.add(employee5);
        workers.add(employee6);

        double week1Hours = 40;
        double week2Hours = 50;
        double week3Hours = 40;

        for(int wks = 3; wks > 0; wks --)
        {
            double currentPeriod = 0;
            if(wks == 3)
            {
                currentPeriod = week1Hours;
                System.out.println("Week 1");
            }
            if(wks == 2)
            {
                currentPeriod = week2Hours;
                System.out.println("Week 2");
            }
            if(wks == 1)
            {
                currentPeriod = week3Hours;
                System.out.println("Week 3");
            }
            for(Worker Workers : workers)
            {
                System.out.print(Workers.getFirstName() + ": ");
                System.out.println(Workers.displayWeeklyPay(currentPeriod));
            }
            System.out.println(); //Separates each week in table
        }

    }
}
