
public class functiondemo {

	public static void main(String[] args) 
	{
	    function<LocalDate,Integer> yearRetriever = date -> date.getYear();
		  LocalDate today = LocalDate.now();
		System.out.println("Year corresponding to "+today+" is "+yearRetriever.apply(today));


	}

}
