public class Democons {
	int num,num1,num2;
	 public Democons()
	 {
		 num=7;
	 }
	 public Democons(int num,int num1)
	 {
		 num=num;
		 num1=num1;
	 }
	public Democons(int n,int j,int k)
	{
		num=n;
		num1=j;
		num2=k;
	}
	public static void main(String[] args) {
	 Democons obj=new Democons(7,9);
	 System.out.println("the value of num"+obj.num);
	 System.out.println("the value of num"+obj.num1);
	 System.out.println("the value of num"+obj.num2);
	}

}
