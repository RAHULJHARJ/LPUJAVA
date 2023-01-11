public class RunningNumberSquareSum{
static int sumDivisibles(int A, int B)
{
	int sum = 0;
	for (int i = A; i <= B; i++)
			sum += i*i;
	return sum;
}
public static void main(String[] args)
{
	int A = 1, B = 100;
	System.out.print(sumDivisibles(A, B) +"\n");
}
}
