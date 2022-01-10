import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	int c1 = 0;
	int c2 = 0;
	int c3 = 0;
	Random rand = new Random();
	public static int[] getCubeTosses(int numTosses)	{
		
	int [] x = new int[numTosses];
		
	for(int c = 0; c<x.length; c++)	{
			x[c] = rand.nextInt(6)+1;
		}
		return x;
	}
	
	public int getLongestRun(int [] values)	{
	
	for(int count = 1; count<values.length; count++)	{
		if(values[count]==values[count-1])	{
		
		c1 ++;
		}
		else	{
			if(c1>c2)	{
				c2=c1;
			c3=count-c1;
			}
		}
	c1=0;
	}
	return c3;

	}
	public static void main(String args[]) {
		// Your code goes below here
	int[] test = getCubeTosses(100);
	System.out.println(getLongestRun(test));
	}	
}
