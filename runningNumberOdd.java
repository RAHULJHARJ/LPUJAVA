public class RunningNumberSum { 
 public static void main(String[] args) {
 final int LOWERBOUND = 2;
 final int UPPERBOUND = 3;
 int sum = 0; 
 int number = LOWERBOUND;
 while (number <= UPPERBOUND) {
 sum = sum + number; 
 number=number+2; 
 }
System.out.println("The sum from " + LOWERBOUND + " to " +
UPPERBOUND + " is " + sum);
 }
}