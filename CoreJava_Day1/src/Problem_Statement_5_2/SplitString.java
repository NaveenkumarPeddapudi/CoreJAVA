package Problem_Statement_5_2;

public class SplitString {
	public static void main(String[] args) {
				
		String txt= (" 26   +   55   -   (   344   /   14   ) ");
		String[] w=txt.split("\\s");
		
			for(String w1:w){  
				
				System.out.println(w1); 
				
			}
		}

	}
