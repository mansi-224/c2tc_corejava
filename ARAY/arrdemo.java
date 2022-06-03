
public class arrdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]=new int[4];
      arr[0]=10;
      arr[1]=20;
      arr[2]=30;
      arr[3]=40;
     /* for(int i=0;i<4;i++)
      {
      System.out.println(arr[i]);
	}*/
       for(int i:arr)
       {
    	   System.out.println(i);
       }
	
}
}