
public class demoarr {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= {7,8,9,0};
		int d[][]= {a,b,c};
		
	//System.out.println(d[0][2]);
		for (int i=0;i<d.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(""+d[i][j]);
			}
			System.out.println();
		}
		}

	}


