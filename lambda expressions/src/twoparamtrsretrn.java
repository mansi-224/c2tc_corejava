public interface twoparamtrsretrns
{
public int operate(int num1,int num2);
}

public class twoparamtrsretrn {

	public static void main(String[] args) {
		twoparamtrsretrns op = (num1,num2) -> num1+num2;
		int sum = op.operate(10,20);
		System.out.println("sum:"+sum);
		}
		} 		
	


