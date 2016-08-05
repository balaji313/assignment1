package looping;

public class Looping {
	

	public static void main(String[] args) {
		
		for( int i=1 ; i<=5 ; i++)
		{
			for (int j=1; j<=i ;j++){
				System.out.print(j+"");
			}
			System.out.println("");
		}
		
   for(int k=4 ; k>=1 ; k--)
   {
	   for(int b=1; b<=k;b++)
	   {
		   System.out.print(b+"");
	   }
	   System.out.println("");
   }
 
   
	}

}
