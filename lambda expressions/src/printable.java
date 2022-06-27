
public interface printable {
public void print(String str);
default void format(String str)
{
	System.out.println("formatting string str ....");
}
}
