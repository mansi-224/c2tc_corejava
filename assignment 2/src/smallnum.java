import java.util.Scanner;
public class smallnum {

	public static void main(String[] args) {
		int a, b, c, smallest, temp;  
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		//comparing a and b and storing the smallest number in a temp variable  
		temp=a<b?a:b;  
		//comparing the temp variable with c and storing the result in the variable names smallest  
		smallest=c<temp?c:temp;  
		System.out.println("The smallest number is: "+smallest);  

	}

}
