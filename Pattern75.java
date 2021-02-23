/**


	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15

 
 
 
 */
public class Pattern76 {

	public static void main(String[] args) {
		for (int i = 0,x= 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(x++ +" ");
			}
			System.out.println();
		}

	}

}
