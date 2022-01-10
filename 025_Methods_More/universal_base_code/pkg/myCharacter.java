package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
    String role;
    int strength = 0;
    int dexterity = 0;
    int intelligence = 0;
    int constitution = 0;
    int charisma = 0;
    public myCharacter(String a){
        role = a;
    }
    public myCharacter(){
        role = ("no role");
        System.out.println(role);
    }
    public String setRole(String a){
        boolean Wiz = role.equals("Wizard");
		boolean wiz = role.equals("wizard");
		boolean War = role.equals("Warrior");
		boolean war = role.equals("warrior");
		boolean Rog = role.equals("Rogue");
		boolean rog = role.equals("rogue");
        if(Wiz || wiz){
            String wi = new String("You are a Wizard! How magical!");
            System.out.println(wi);
        }
        if(War || war){
            String wa = new String("You are a Warrior! Enjoy your time on the battlefield!");
            System.out.println(wa);
        }
        if(Rog || rog){
            String r = new String("You are a Rogue! How cunning!");
            System.out.println(r);
        }
        else if(!Wiz && !wiz && !War && !war && !Rog && !rog){
            role = ("No Role");
            System.out.println(role);
        }
        return role;
    }
    public int setStrength(int x){
        strength=x;
        return strength;
    }
    public int setDexterity(int x){
        dexterity=x;
        return dexterity;
    }
    public int setIntelligence(int x){
        intelligence=x;
        return intelligence;
    }
    public int setConstitution(int x){
        constitution=x;
        return constitution;
    }
    public int setCharisma(int x){
        charisma=x;
        return charisma;
    }
    public boolean setAll(String a, int b, int c, int d, int e, int f){
        role = a;
        strength = b;
        dexterity = c;
        intelligence = d;
        constitution = e;
        charisma = f;
        return true;
    }
    public void myToString(){
        System.out.println("You are a "+role);
        System.out.println("Your strength trait is "+strength);
        System.out.println("Your dexterity trait is "+dexterity);
        System.out.println("Your intelligence trait is "+intelligence);
        System.out.println("Your constitution trait is "+constitution);
        System.out.println("Your charisma trait is "+charisma);
    }
}