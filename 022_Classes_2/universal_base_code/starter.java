import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		myCharacter jim = new myCharacter();
		myCharacter str = new myCharacter();
		myCharacter dex = new myCharacter();
		myCharacter inte = new myCharacter();
		myCharacter con = new myCharacter();
		myCharacter cha = new myCharacter();
		System.out.println(jim.role);
		System.out.println(str.Str+" strength");
		System.out.println(dex.Dex+" dexterity");
		System.out.println(inte.Int+" intelligence");
		System.out.println(con.Con+" constitution");
		System.out.println(cha.Cha+" charisma");
	}
}
