package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarksValidation {
public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the marks: ");
    //take marks from the user
	int marks=Integer.valueOf(br.readLine());
    //This is for decide if the result is distinction or not
	if(marks>80 && marks<=100) {
    	System.out.println("Distinction");
    }
	//This is for deciding if the result is first class
    else if(marks>50 && marks<=80) {
    	System.out.println("First class");
    }
	//This is for deciding if the result is second class
    else if(marks>35 && marks<=50) {
    	System.out.println("Second class");
    }
	//if the marks is not any of the above then print fail 
    else {
    	System.out.println("Fail");
    }
}
}
