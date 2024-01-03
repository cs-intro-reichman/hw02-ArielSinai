/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
 

 public class InOrder {
	public static void main (String[] args) {
		int number= (int) (Math.random() * 11);
		int followinNumber; 
		String seq= "" + number; 
		
		do{
			followinNumber= (int) (Math.random() * 11);
			
			if(followinNumber<number) {
				break;
			}
			seq= seq + " " + followinNumber;
			number = followinNumber;
			
		} while (number <= followinNumber);

		
		System.out.println(seq);

	}
}

