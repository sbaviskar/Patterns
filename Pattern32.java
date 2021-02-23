/*
		 
		      A 
		    A B 
		   A B C 
		  A B C D 
		 A B C D E 
		A B C D E F 

 
 */
public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <= 5; i++) {
			int a = 0 ;
			for(int j = 0; j <= 5; j++) {
				if(j+i > 4)
					System.out.print((char)(65+a++)+" ");
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}

	}

}
