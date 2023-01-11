public class RunningNumberMod7Sum{
static int sumDivisibles(int A, int B, int M)
{
	int sum = 0;
	for (int i = A; i <= B; i++)
		if (i % M == 0)
			sum += i;
	return sum;
}
public static void main(String[] args)
{
	int A = 1, B = 1000, M = 7;
	System.out.print(sumDivisibles(A, B, M) +"\n");
}
}
