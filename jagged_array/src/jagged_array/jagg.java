package jagged_array;

public class jagg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2 ][];
		
		a[0]=new int[3];
		a[1]=new int[2];
		int count=0;
		 for (int i=0;i<a.length;i++)
			 for(int j=0;j<a.length;j++)
			 a[i][j]=count++;
		 System.out.println("2d");
		 for(int i=0;i<a.length;i++)
		 {
		 for(int j=0;j<a.length;j++)
         System.out.println(a[i][j]+"");
		 System.out.println();
			
		 }

	}

}
