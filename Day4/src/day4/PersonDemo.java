package day4;
import java.util.Scanner;
public class PersonDemo {
   
	public static void main(String[] args) {
//	Scanner ob = new Scanner(System.in);
//	
//	String name;
//	System.out.println("Enter Name of Person : ");
//    name = ob.next();
//    System.out.println("Enter Age : ");
//    int age = ob.nextInt();
//    System.out.println("Enter Gender : ");
//    String gender = ob.next();
//    System.out.println("Enter Taxable Income : ");
//    int income = ob.nextInt();
//	
//Person person = new Person();
//person.setName(name);
//person.setAge(age);
//person.setGender(gender);
//person.setIncome(income);
//
//System.out.println(person);
//TaxCalculator calc = new TaxCalculator();
//calc.calculateTax(person);
//System.out.println("After Calculating Final Tax is : ");
//System.out.println(person);
//ob.close();
		
		student std = new student();
		
		std.setName("Rushabh");
		std.setAge(20);
		std.setEnroll(7022);
		std.setResult(84);
		std.setGender("Male");
		std.setMobno(637673809);
		System.out.println(std.getName()+ std.getAge()+ std.getGender()+ std.toString());
		
}
	}
