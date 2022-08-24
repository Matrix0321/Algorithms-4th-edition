Code:

package algo;

public class Ex1_11 {
	public static void printBooleanMatrix(boolean[][] matrix) {
		System.out.print(' ');
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.print(i);//print columns
		}
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i);//print rows
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] ? '*' : ' ');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		boolean[][] a = { { true, true, true }, { false, false, false },{ true, false, true } };
		printBooleanMatrix(a);
	}
}

Output:

 012
0***
1   
2* *
