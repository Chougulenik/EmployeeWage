package com.bridgelabz;

public class EmployeeWage {
	static final int Full_Time= 1;
	static final int Part_Time= 2;
	static final int Wage_Per_Hrs =20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     System.out.println("Welcome Employee Wage Computation Program");
	
  		int empHrs = 0;
  		//int empWage = 0;
 
        int empCheck = (int)Math.floor(Math.random() *10) % 3;
        switch (empCheck) {
        case Full_Time :
                empHrs=8;
                break;
        case Part_Time :
        		empHrs=4;
        		break;
        }		
        int empWage = empHrs * Wage_Per_Hrs;
        System.out.println("Emp Wage : " +empWage);

	}

}
