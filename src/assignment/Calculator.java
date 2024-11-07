package assignment;

public class Calculator {
public int add(int a,int b) {
	return a+b;
}
public int add(int a,int b,int c) {
	return a+b+c;
	
}
public double add(double a,double b) {
	return a+b;
}
public static void main(String args[]) {
	Calculator cal=new Calculator();
	System.out.println("Addition of two integers: "+cal.add(10, 20));
	System.out.println("Addition of three integers: "+cal.add(10, 20,30));
	System.out.println("Addition of two doubles: "+cal.add(20.5, 35.7));
	
}
}
