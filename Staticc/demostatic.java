
public class demostatic {
	int sid;
	String sname;
	static String collegename;
	public static void show()
	{
		 System.out.println("sid is "+collegename);
	}
	public static void main(String[] args) {
		demostatic ob=new demostatic();
		ob.sid=12;
		ob.sname="sai kumar";

		System.out.println("the sid is "+ob.sid);
        System.out.println("the sname is "+ob.sname);
		demostatic.collegename="VIIT";
		//ob.collegename="VIIT";
        demostatic.show();
	}

}
