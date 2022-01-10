import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
	
	private String guessingWord;
	private int numTries;
	
	public Hangman() {
		generateWord();
		numTries = 5;
	}
	
	public Hangman(int nT) {
		generateWord();
		numTries = nT;
	}
	
	public static generateWord() {
		//working segment of code
	}
	
	public static int guessCheck(String letter, int start) {
		int index = -1;
		for(int count = 0; count<guessingWord.length(); count++) {
			if(guessingWord.substring(count, count+1).equals(letter)){
				index = count;
				return index;
			}
		}
		return index;
	}
	
	public static boolean checkWin(boolean[] arr) {
		for (int c = 0; c<arr.length; c++) {
			if(arr[c]==false) {
				return false;
			}
		}
		return true;
	}
}
class starter {
	
	public static int getMode(int[] arr) {
		int mode = -1;
		int c = 0;
		for(c=0; c<arr.length; c++) {
			for(int c2=0; c<arr.length; c)
			//lots of code that definitely works and produces a mode :)
		}
	}
	
	public static int getMedian(int[] arr) {
		int median;
		if((arr.length%2)==0) {
			median = arr[(arr.length/2)-1];
			return median
		}
		else {
			int x = arr.length/2
			median = arr[x];
			return median;
		}
		
		
		
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
