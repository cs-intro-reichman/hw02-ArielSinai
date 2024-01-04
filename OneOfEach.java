

public class OneOfEach {
	public static void main (String[] args) {
		boolean girl=false;
		boolean boy=false;
		int children=0;
		double child;

		do{
			child= (Math.random());
			if(child>0.5) {
				boy= true;
				System.out.print("b "); }
			else {
				girl= true;
				System.out.print("g ");
			}
			children= children+1;
			
		} 
		while(girl!=true || boy!=true);
	
	}
}
