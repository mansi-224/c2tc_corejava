//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*; 
public class posnegbufferedr {

	public static void main(String[] args) 
	
		             throws IOException 
		             { 
		                    BufferedReader PosNeg = new BufferedReader(new InputStreamReader(System.in)); 
		                         String m; 
		                         int n,Pos, Neg,i; 
		                         Pos=Neg=0;  
		                         System.out.println("Enter any 5 Number "); 
		                         for(i=1;i<=5;i++) 
		                         { 
		                                     m=PosNeg.readLine(); 
		                                     n=Integer.parseInt(m); 
		                                     //if(n==0)Zer++; 
		                                     if(n<0)Neg++; 
		                                     if(n>0)Pos++; 
		                         } 
		                         System.out.println("The Positive Numbers are : "+Pos); 
		                         System.out.println("The Negative Numbers are : "+Neg); 
		                       //  System.out.println("The Zero Values are : "+Zer); 
		             } 
		 }   


	




















/*package scannerbuffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferdemo {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a value");
		String str=br.readLine();
		//int str=Integer.parseInt(br.readLine());
		System.out.println("enter the value is "+str);
	}

}*/





