/*Write a program(WAP) to print INEURON using pattern programming logic.*/

public class QuestionOne {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			//to print I
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 ||(j==(n-1)/2) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//to print N
			for(int j=0;j<n;j++) {
				if(j==0 || (i==j)|| j==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//to print E
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || i==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//to print U
			for(int j=0;j<n;j++) {
				if((j==0 && i<n-1) || (i==n-1 &&j>0 && j<n-1) ||(j==n-1 && i<n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//to print R
			for(int j=0;j<n;j++) {
				if((j==0 && i>0) || (i==0 && j>0 && j<n-1) || (j==n-1 && i>0 && i<(n-1)/2) || (i==(n-1)/2 && j<n-1) ||(i==j & i>(n-1)/2) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//to print O
			for (int j = 0; j < n; j++) {
				if ((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (j==n-1 &&i>0 && i<n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//to print N
			for(int j=0;j<n;j++) {
				if(j==0 | (i==j)| j==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
