public interface operator 
{
public int operate(int num1,int num2);
}  

public class operatordemo {

	public static void main(String[] args) {
	operator op = (num1,num2) -> num1+num2;
	int sum = op.operate(10,20);
	System.out.println("sum:"+sum);
	operator op2 = (num1,num2) -> num1-num2;
		int difference = op2.operate(25, 10);
		System.out.println("Difference:"+difference);


	}

} 

