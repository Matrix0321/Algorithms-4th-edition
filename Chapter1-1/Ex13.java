Code:

package algo;

public class Ex1_13 {
	public static void printTransposedMatrix(int[][]matrix) {
		for(int i=0;i<matrix[0].length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.printf("%5d", matrix[j][i]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6}};
		printTransposedMatrix(a);
	}

}



Output:

    1    4
    2    5
    3    6
