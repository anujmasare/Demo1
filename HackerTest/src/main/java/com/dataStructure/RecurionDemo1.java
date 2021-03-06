package com.dataStructure;

public class RecurionDemo1 {

	public static void main(String[] args) {

		// EX1
		// int a[]= {10,2,1,4};
		// System.out.println(searchBiggestArray(a,3));

		// EX2
		crazy(4);


		//EX3
		// System.out.println(fact(8));
		// System.out.println(factorial(8));
		// int n=10;
		// for(int i =1;i<n;i++) {
		// fibonacciNormal(i);
		// System.out.println(fibonacciRecusion(i));
		// }
		// Print(8);

		//ex4
		//int test = 3;
		// printFun(test); //321123
		// System.out.println("");
		
		//ex5
		// printFunRecursion(test);
		
		//ex6
		// System.out.println(fun(4,3));

		//ex7
		// System.out.println(funMulti(10,10));
		
		//ex8
		// System.out.println(funDiv(50,5));


	}

	public static void crazy(int n) {
		if (n <= 0)
			return;
		crazy(n - 1);
		System.out.println(n + "    ");
		crazy(n-1 );
	}

	static int big = 0;

	public static int searchBiggestArray(int a[], int n) {
		if (n == -1)
			return big;
		else {
			if (big < a[n]) {
				big = a[n];
			}
			searchBiggestArray(a, --n);
			return big;
		}

	}

	static int fun(int x, int y) {
		if (x == 0)
			return y;
		return fun(x - 1, x + y);
	}

	static int funMulti(int a, int b) {
		if (b <= 0)
			return 0;
		else {
			System.out.println(a + "      " + b);
			return a + funMulti(a, b - 2);
		}

	}

	static int count = 0;

	static int funDiv(int a, int b) {
		// int count=1;
		if (a == 0)
			return 0;
		else {
			++count;
			System.out.println(a + "    " + b + "   " + count);
			funDiv(a - b, b);
			return count;
		}
	}

	public static int printFunRecursion(int n) {

		if (n <= 0) {
			return 0;
		} else {
			System.out.print(n);
			return printFunRecursion(n - 1);
		}
	}

	public static void printFun(int n) {
		for (int i = n; i > 0; i--) {
			System.out.print(i);
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
		}
	}

	public static int fibonacciRecusion(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return (fibonacciRecusion(n - 1) + fibonacciRecusion(n - 2));
		}

	}

	public static void fibonacciNormal(int n) {
		int a = 0, b = 1, c = 0;
		System.out.print(0);
		for (int i = 1; i <= n; i++) {
			c = a + b;
			System.out.print("    " + c);
			b = a;
			a = c;
		}
		System.out.println("");
	}

	public static int Print(int n) {
		if (n < 0)
			System.out.println("asfasfd");
		else {
			System.out.println(Print(n - 1));
		}
		return n;
	}

	public static int fact(int n) {
		int c = 1;
		for (int a = 1; a <= n; a++)
			c = c * a;
		return c;
	}

	public static int factorial(int n) {
		if (n < 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}
}
