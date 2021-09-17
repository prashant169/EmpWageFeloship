package wagemont;

public class Empwage {
	
	 public static final int IS_PART_TIME =1;
	 public static final int IS_FULL_TIME =2;
	 public static final int EMP_RATE_PER_HOUR = 20;
	 public static final int NUM_Of_WORKING_DAYS =2;
	 
	 public ststic void msin(String args[]){
		 //variables
		 
		 int empHrs = 0,
	     empWage = 0,
	     totalEmpWage =0;
		 //computation
		  		 	
		 for (int day = 0; <NUM_OF_WORKING_DAYS; DAY++){
		int empCheck =(int) Math.flor(Math.random() * 10) % 3;
		switch (empCheck) {
		case IS_PART_TIME;
		empHrs = 4;
		break;
		cade IS_FULL_TIME;
		empHrs = 8;
		break
		default;
			emphrs = 0;
			
		}
		empWage = empHs * EMP_RATE_PER_HOUR;
		totalEmpWage +=EmpWage
		System.out.println("Emp Wage: " + empWage);
		 
		 }
		System.out.println("Total Emp Wage:" + totalEmpWage);
		
	 }
	 		 
}
