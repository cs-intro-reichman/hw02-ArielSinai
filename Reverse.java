/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
import java.lang.Math;
public class Reverse {
	
	public static void main (String[] args){
		String s= args[0];
        int lenght= s.length();
	    for(int i=lenght-1; i>=0; i--) {
			System.out.print(s.charAt(i));
			
		}
		System.out.println();

		if(lenght%2==0) {
			int middle= lenght/2;
			System.out.println("The middle character is " + s.charAt(middle));
		} else{
			double middle1= lenght/2;
			int middle= (int)Math.floor(middle1);
			System.out.println("The middle character is " + s.charAt(middle));
		}
		
	}

}
