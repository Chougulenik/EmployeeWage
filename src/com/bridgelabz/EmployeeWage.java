package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     System.out.println("Welcome Employee Wage Computation Program");
	
  		int Full_time = 1;
        int empCheck = (int)Math.floor(Math.random() *10) % 2;
        if ( empCheck == Full_time )
                System.out.println("employee present");
        else
               System.out.println("employee not present");


	}

}
