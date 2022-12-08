
public class Hello {
	
	public static void sum(int[] x) {
		int total = 0;
		for (int x1 : x) {
			total = total + x1;
		}
		System.out.println("The sum is " + total);
	}

	public static void main(String[] args) {
		
		// System.out.println(args.length);
		
		int [] x = new int [6];
		System.out.println(x.length);
		
		String[] s = {"A", "AA", "AAA"};
		System.out.println(s.length);
		
		String s1 = "Ganesh";
		System.out.println(s1.length());
		
		int[][] y = new int[6][3];
		System.out.println(y.length);
		System.out.println(y[0].length);
		
		sum(new int [] {10, 20, 30, 40});
		
		
		int m = 10;
		int n = 20;
		int num = (m>n) ? m:n;
		System.out.println(num);
	}
}
