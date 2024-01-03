/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int lines= Integer.parseInt(args[0]);
		String star="";

		for(int i=1 ; i<=lines ; i++) {
			star= star + "* ";
		}
		for(int j=1 ; j<=lines ; j++) {
			if(j%2==0){
                System.out.println(" " + star);
			}
			else{
				System.out.println(star);
			}
		}
	}
}
