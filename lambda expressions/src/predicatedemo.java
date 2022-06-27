boolean test(T t);
public class predicatedemo
{
 public static void main(String[] args) {
	predicate<String> stringChecker = str -> str.isEmpty();
  	String s = "Hello";
	bboolean result = stringChecker.test(s);
	System.out.println(s+" is empty:"+result);


	}

}
