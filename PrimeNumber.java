import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to be check : ");
		int no=sc.nextInt();
		int flag=0;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=1;
				break;
		}
		}
		if (flag==1)
		{
		System.out.println("NOT PRIME");
	}
	
	else{
		System.out.println("PRIME");
		
		
	}

}
}