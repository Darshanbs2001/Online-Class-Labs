package assignment.flowstatements;

import java.util.Scanner;
//Program to count the number of odd and even integers given 
//by the user
public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //we initially keep the evenCount and oddCount as 0 and record
    //user response using response variable
    int n,evenCount=0,oddCount=0,response;
    do {//this do while loop will run until the -1 is pressed
      System.out.println("Enter the number: ");
      n = in.nextInt();
      //condition for the even case
      if (n % 2 == 0) {
        
        evenCount+=1;//increment the evenCount
      } else {
        
        oddCount+=1;//increment the oddCount
      }
      //take the user response
      System.out.println("Do you want exit then press -1 or else press 0");
       response=in.nextInt();
      if(response==-1) {
    	  //if the response is -1 then display the results
    	  System.out.println("Number of odd numbers entered are : "+oddCount);
    	  System.out.println("Number of even numbers entered are: "+evenCount);
      }

    }while(response!=-1);
    in.close();

  }
}
