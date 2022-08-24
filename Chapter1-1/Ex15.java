Code:

package algo;

public class Ex1_15 {
	public static int[] histogram(int[]a,int M){
		int[] res= new int[M];
		for (int i=0;i<a.length;i++) {
			if (a[i]>=0 && a[i]<=(M-1)) {
				res[a[i]]++;
			}
		}
		return res;
	}
	public static void main(String[]args) {
		int[] a= {1,2,3,4,5,4,3,2,1};
		int[] res=histogram(a,6);
		for (int i=0;i<res.length;i++) {
			System.out.printf("%5d",res[i]);
		}
	}

}


Output:

    0    2    2    2    2    1
      
(And sum up all the items in the output, the result is 9, so to speak a.length)
