import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a name");
		String name=sc.nextLine();
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Enter your gender");
		char gender=sc.next().charAt(0);
		
		System.out.println("enter your CGPA");
		double cgpa=sc.nextDouble();
		
		System.out.println("Enter your fone number");
		long mobileNo=sc.nextLong();
		
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Gender is:"+gender);
		System.out.println("CGPA is:"+cgpa);
		System.out.println("Phone is: "+mobileNo);
		
		
	}

}
