package com.bridgelabz.employeewage;

public class Employee

{

    public int wagePerHour = 20;
    public   int workingHours=8;

    // check present or not
public  boolean attendence()
{
    int isPresent=1;
int employyee =(int) Math.floor(Math.random() * 10) % 2;
if(employyee == isPresent)
    return true;
else
    return false;
}
}
