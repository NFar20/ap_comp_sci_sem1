import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your favorite integer.");
		int x = sc.nextInt();
		System.out.println("Now type a different integer.");
		int y = sc.nextInt();
		System.out.println("Now type a third (different) integer.");
		int z = sc.nextInt();
		boolean equal = x==y;
		boolean same = y==z;
		boolean equality = x==z;
		boolean one = x>y;
		boolean onetwo = x>z;
		boolean two = y>x;
		boolean twotwo = y>z;
		boolean three = z>x;
		boolean threetwo = z>y;
		boolean not = y!=x;
		boolean nottwo = y!=z;
		boolean notthree = z!=x;
		
		System.out.println();
		
		if((equal) || (same) || (equality))
		{
			System.out.println("Please input DIFFERENT values. Rerun program.");
		}
		
		if((one) && (onetwo))
		{
			System.out.println(x + " is the largest number of all three.");
		}
		
		if((two) && (twotwo))
		{
			System.out.println(y + " is the largest number of all three.");
		}
		
		if((three) && (threetwo))
		{
			System.out.println(z + " is the largest number of all three.");
		}
		
		if((twotwo) && (onetwo) && (not))
		{
			System.out.println(z + " is the smallest number of all three. Have a great day.");
		}
		
		if((one) && (threetwo) && (notthree))
		{
			System.out.println(y + " is the smallest number of all three. Have an excellent day.");
		}
		
		if((two) && (three) && (nottwo))
		{
			System.out.println(x + " is the smallest number of all three. Have a nice day.");
		}
	}	
	}
}
