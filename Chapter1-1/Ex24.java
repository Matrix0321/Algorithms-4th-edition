Code:

package algo;

// Euclid's algorithm is used to calculate the GCD (greatest common divisor) of two integers.

public class Ex24 {
	public static int Euclid(int p,int q) {
		System.out.println("p = "+p+", q = "+ q);
		if (p==0||q==0) {
			return 1;
		}
		if (p<q) {
			int tmp=p;
			p=q;
			q=tmp;
		}//Swap to make sure that p is always no less than q
		if (p%q==0) {
			return q;
		}else {
			System.out.println("remainder = "+ p%q);
			return Euclid(p,p%q);//Recursion
		}
	}
	public static void main(String[]args) {
		System.out.println("result: "+Euclid(1111111, 1234567));
	}

}


Output:

p = 1111111, q = 1234567
remainder = 123456
p = 1234567, q = 123456
remainder = 7
p = 1234567, q = 7
remainder = 5
p = 1234567, q = 5
remainder = 2
p = 1234567, q = 2
remainder = 1
p = 1234567, q = 1
result: 1
