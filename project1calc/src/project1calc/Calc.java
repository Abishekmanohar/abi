package project1calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		int d=1;
		while(d==1) {
		int a,b,c;
		float r=0;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the first no:");
	    a=sc.nextInt();
	    System.out.println("enter the second no:");
	    b=sc.nextInt();
	    System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Modulo\nEnter the choice");
	    c=sc.nextInt();
	    switch(c) {
	    case 1:
	    	r=a+b;
	    	break;
	    case 2:
	    	r=a-b;
	    	break;
	    case 3:
	    	r=a*b;
	    	break;
	  case 4:
	    	r=(float)((float)a/(float)b);
	    	break;
	    case 5:
	    	r=a%b;
	    	break;
	    default:
	    	System.out.println("Exit");
	    	
	    }
	    if(c>=1 && c<=3 || c==5)
	    {
	    	System.out.println((int)(r));
	    }
	    else if(c==4)
	    {
	    System.out.println(r);	
	    }
	    
	    System.out.println("If you want to continue press 1 or press 0");
	    d=sc.nextInt();
	    
	    
		}
		System.out.println("Thank you");
	    	

		
	}

}
