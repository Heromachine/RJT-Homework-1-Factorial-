import java.util.*;
public class main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in); 
		
		int n;		
		System.out.println("Enter a Number");
		n = sc.nextInt();
		
		
		int temp = n; 
		int r, sum = 0; 
		
		while (n > 0)
		{
			r = n%10;
			n = n/10;
			sum = sum + r*r*r; 
		}
		
		if (temp == sum)
		{
			System.out.print("Armstrong number ");
		}
		else 
		{
			System.out.print("NOT Armstrong number");
		}

	}

}
