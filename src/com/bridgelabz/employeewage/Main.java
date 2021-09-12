package com.bridgelabz.employeewage;

public class Main {

    public static void main(String[] args)
    {
        Employee employee = new Employee();
        int numofdays=0;
        int presentDays=0;
        int absentDays=0;
        int wagePerHour = employee.wagePerHour;
        int workingHours = employee.workingHours;
        int totalWage=0;

while (numofdays!=20)
{
    if(employee.attendence()){
       int wageOfDay = wagePerHour*workingHours;
        numofdays++;
        totalWage+=wageOfDay;
        presentDays++;

    }
    else
    {
        absentDays++;
    }


}
System.out.println("Total Present days are =" + presentDays);
System.out.println("");
System.out.println("Total absent days are =" + absentDays);
System.out.println("");
System.out.println("Total wage will be = " + totalWage);
    }
}
