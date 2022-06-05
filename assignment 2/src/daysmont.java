import java.io.*;
import java.util.*;
public class daysmont {

	public static void main(String[] args) {
		        int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		        int month = 12, year=2012;
		        if(month==2 && ((year%400==0) || ((year%100!=0)&&(year%4==0))))
		            System.out.println("Number of days is "+ arr[month-1]+1);
		    
		        else System.out.println("Number of days is "+arr[month-1]);
		            
		    }
	}


