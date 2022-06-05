
public class swap {

	public static void main(String[] args) {
		int x = 12, y = 24;
		 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

	}

}
