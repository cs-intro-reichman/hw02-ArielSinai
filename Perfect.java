/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number= Integer.parseInt(args[0]);
		int divisorSum=1;
		int divisor;
		String divisorsString= "1";
		for(int i=2 ; i<number ; i++) {
			
			if (number%i ==0) {
				 divisor= i;
				 divisorsString= divisorsString + " + " + divisor ;
			     divisorSum= divisorSum + divisor;}
			}
        	
			
			if(divisorSum==number) {
				System.out.println(number + " is a perfect number since " + number + " = " + divisorsString);
			} else {
				System.out.println(number + " is not a perfect number");
			}


		}
	}

