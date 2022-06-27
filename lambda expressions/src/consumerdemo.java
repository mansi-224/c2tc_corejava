
public class consumerdemo {

	public static void main(String[] args) {
		consumer<Integer> multiplier = num -> System.out.println(num*num);
		multiplier.accept(10);
		multiplier.accept(4);


	}

}
