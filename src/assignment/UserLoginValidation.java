package assignment;

import java.util.Scanner;

public class UserLoginValidation {
public static void main(String[] args) {
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the user name:");
    name=sc.next();//take user name as input
    if(name.equals("admin")) {//check if name is admin
    	System.out.println("User is valid ");
    	System.out.println("Enter the password: ");//take password as input
    	String password=sc.next();//take password as input 
    	if(password.equals("9141525275")) {//check if the password is correct
    		System.out.println("password is correct");
    		System.out.println("Login successfull");
    	}
    	else {//if the password is incorrect then display
    		System.out.println("password is incorrect");
    		System.out.println("Login unsuccessfull");
    	}
    }
    else {//if the user name itself is wrong then display this
    	System.out.println("User is invalid");
    	System.out.println("Login unsuccessfull");
    }
	sc.close();	
}
}
