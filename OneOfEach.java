

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
				children= children+1;
				System.out.print("b "); }
			if(child<0.5) {
				girl= true;
				children= children+1;
				System.out.print("g ");
			}

			
		} 
		while(girl!=true || boy!=true);
	
	}
}
