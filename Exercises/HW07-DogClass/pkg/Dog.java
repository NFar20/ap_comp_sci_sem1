package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public int age;
	public String breed;
	public String name;
	public Dog() {
		name="Clifford";
		age=3;
		breed="big red dog";
	}
	public Dog(String a){
		name=a;
		age=1;
		breed="dog dog";
	}
	public Dog(String a, String b){
		name=a;
		breed=b;
		age=1;
	}
	public Dog(String a, int x){
		name=a;
		age=x;
		breed="dog dog";
	}
	public void setName(String a){
		name=a;
	}
	public void setAge(int x){
		age=x;
	}
	public void setBreed(String a){
		breed=a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		int chance = rand.nextInt(2);
		if(chance==0){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name+" barks!");
	}

}
