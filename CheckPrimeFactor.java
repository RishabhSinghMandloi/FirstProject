package org.BridgeLabzs.MyProject;
import java.util.Scanner;
public class CheckPrimeFactor{
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int num=sc.nextInt();
	System.out.println("Prime Factor are");
	primeFactor(num);
	sc.close();
}
   private static void primeFactor(int n)
   {
	 for(int i=1;i<=n;i++)
	 {
	   if(checkPrime(i)&&n%i==0)
	   {
		  System.out.println(i);
	   }
	 }
   }
   private static boolean checkPrime(int n)
   {
 	  int i=2;        //20
 	  while(i<=n/2)
 	  {
 		  if(n%i==0)
 		  return false;
 		  i++;
 	  }
 	 return true;
   }
}
