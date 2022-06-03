
public class democonst {
	int num,num1,num2;
	public democonst()
	{
		num=7;
	}
	public democonst(int n,int j)
	{
		num=n;
		num1=j;
	
	}
	public democonst(int n,int j,int k)
	{
		num=n;
		num1=j;
		num2=k;
	}
	public static void main(String[] args) {
		democonst obj=new democonst();
		 System.out.println("the value of num"+obj.num);
		 System.out.println("the value of num"+obj.num1);
		 System.out.println("the value of num"+obj.num2);
	}

}
