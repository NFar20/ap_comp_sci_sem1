package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
    public String Role;
    public myCharacter(String a){
        Role = a;
        boolean Wiz = Role.equals("Wizard");
		boolean wiz = Role.equals("wizard");
		boolean War = Role.equals("Warrior");
		boolean war = Role.equals("warrior");
		boolean Rog = Role.equals("Rogue");
		boolean rog = Role.equals("rogue");
        if(Wiz || wiz){
            String wi = new String("You are a Wizard! How magical!");
            System.out.println(wi);
        }
        if(War || war){
            String wa = new String("You are a warrior! Enjoy your time on the battlefield!");
            System.out.println(wa);
        }
        if(Rog || rog){
            String r = new String("You are a Rogue! How cunning!");
            System.out.println(r);
        }
        else if(!Wiz && !wiz && !War && !war && !Rog && !rog){
            Role = ("No Role");
            System.out.println(Role);
        }
    }
    public myCharacter(){
        Role = ("no role");
        System.out.println(Role);
    }
}