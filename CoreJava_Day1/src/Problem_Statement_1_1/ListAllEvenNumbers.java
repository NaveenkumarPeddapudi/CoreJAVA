package Problem_Statement_1_1;

public class ListAllEvenNumbers {

	public static void main(String[] args) {
		
		int n= 100;
		
		System.out.print("Even Numbers from 1 to "+n+" are:\n");

		for (int i = 1; i <= n; i++) {
			
			if (i % 2 == 0) {

			   System.out.print(i+" \n");

		   }

		}

	}

}