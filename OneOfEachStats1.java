/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);

		boolean girl;
		boolean boy;
		int children;
		double child;
		int twoCount= 0;
		int threeCount=0;
		int fourCount=0;
		double avarege = 0;




		for (int i = 0; i < T; i++) {
			girl=false;
			boy=false;
			children=0;
			do{
				child= (Math.random());
				if(child>0.5) {
					boy= true;
					// System.out.print("b ");
				}
				else {
					girl= true;
					// System.out.print("g ");
				}
				children= children+1;
				
			} 
			while(girl!=true || boy!=true);

			avarege += (double) children;

			if (children==2) {
				twoCount++;
			}
			else if(children==3) {
				threeCount++;
			}
			else{
				fourCount++;
			}
		}
		avarege /= (double) T;

		String mode = "";
		int max = 0;

		max = Math.max(twoCount, threeCount);
		max = Math.max(max, fourCount);

		if (max == twoCount) {
			mode = "2.";
		}
		else if (max == threeCount) {
			mode = "3.";
		}
		else {
			mode = "4 or more.";
		}

		System.out.println("Average: " + avarege + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoCount);
		System.out.println("Number of families with 3 children: " + threeCount);
		System.out.println("Number of families with 4 or more children: " + fourCount);
		System.out.println("The most common number of children is " + mode);
	}
}
