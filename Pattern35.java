/*
  
	A
	BC
	DEF
	GHIJ
	KLMNO
	PQRSTU
 */
public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		char c = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j-i <= 0) System.out.print(c++);
				else System.out.print("");
			}
			System.out.println();
		}

	}

}
