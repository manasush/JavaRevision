package labAssignment;

//?Q1.Write a  java Program to  show weather a year
//is leap year or not?
public class LeapYear {

	public static void main(String[] args) {
		//What is the leap year?
		
		//if divisible by 4 and not 100 or  also by 400
		//i.e. (divisible by 4 but not century year) or (divisible by 400)
		
		
		int year = 2010;
		
		if((((year%4)== 0) && ((year%100)!=0)) || (((year%400)==0))) {
			
			System.out.println(year + ": is Leap Year!");
			
				
			} else {
			System.out.println(year + ": is not a Leap Year!");
		}

	}

}
