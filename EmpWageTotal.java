package wagemont;

public class Empwage {
	
	 public static final int IS_PART_TIME =1;
	 public static final int IS_FULL_TIME =2;
	 public static final int EMP_RATE_PER_HOUR = 20;
	 public static final int NUM_Of_WORKING_DAYS =2;
	 
	 public ststic void msin(String args[]){
		 //variables
		 
	int  totalEmpHrs =0;totalEmpWage =0,totalworkingDays=0;


		 //computation
		  		 	
		while (totalEmpHrs 0; <MAX_HRS_IN_MONTH &&)
		 totalworkingDays <NUM_Of_WORKING_DAYS){
		 int empHrs =0
	      totalworkingDays++;
		  int empCheck =(int)math.floor(math.random() *10 % 3;
		switch (empCheck) {
		case IS_FULL_TIME;
		empHrs = 8;
		break;
		case IS_PART_TIME;
		empHrs = 4;
		break
		default;
			emphrs = 0;
			
		}
		totalEmpHrs += empHrs;
		 int empWage = empHs * EMP_RATE_PER_HOUR;
		totalEmpWage += EmpWage ;
		System.out.println("Emp Wage: " + empWage);
		 
		 }
		System.out.println("Total Emp Wage:" + totalEmpWage);
		
	 }
	 		 
}
