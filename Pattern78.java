/*
		*    **********    *
		**   ****  ****   **
		***  ***    ***  ***
		**** **      ** ****
		******        ******


*/
public class Pattern78 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 20; j++) {

				if( j - i <= 0 || j + i <= 9 && j > 4 || j - i >= 10 && j < 15 || j +i >= 19 ) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
