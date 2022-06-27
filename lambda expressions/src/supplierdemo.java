
public class supplierdemo {

	public static void main(String[] args) 
	{
	supplier<Double> randomNumberSupplier = () -> new Random(10).nextDouble();
    System.out.println(randomNumberSupplier.get());
	System.out.println(randomNumberSupplier.get());

	}

}
