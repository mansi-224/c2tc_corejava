@FunctionalInterface
public interface operator
{
	public void operate(int num);
}
public class singlparametrdoesntretrn {
public static void main(String[] args) {
	operator op = num->System.out.println("increasing num by 2:"+(num+2));
	op.operate(10);
}
}
