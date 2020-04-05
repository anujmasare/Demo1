package com.matrix.diagonal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class MatrixEx {

	public static void main(String[] args) {
		System.out.println(dayOfProgrammer(1800));
		// migratoryBirds();
		// 18001213575
		// 01171450051
		// 04435470552

		int[] z = { 1, 3, 2, 6, 1, 2 };
		System.out.println(divisibleSumPairs(6, 3, z));

		LinkedList<LinkedList> al = new LinkedList<LinkedList>();
		LinkedList<Integer> v = new LinkedList<Integer>();
		v.add(1);
		v.set(0, 2);
		v.add(2);
		v.add(3);
		al.add(v);
		v = new LinkedList<Integer>();
		v.add(4);
		v.add(5);
		v.add(6);
		al.add(v);
		v = new LinkedList<Integer>();
		v.add(7);
		v.add(1);
		v.add(1);
		al.add(v);
		System.out.println(al);

		int k = al.size() - 1;
		int sumA = 0, sumB = 0;
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < al.size(); j++) {
				int v1 = (Integer) al.get(i).get(j);
				if (i == j)
					sumA = sumA + v1;
				if (j == k) {
					sumB = sumB + v1;
					k--;
				}
			}
		}
		Math.abs(sumA - sumB);
		int[] az = { 1, 2, 3, 4, 5 };
		int[] az1 = { 2, 3, -4 };
		int[] az2 = { 3, -2, -4 };
		// int[] az1=null;
		// plusMinus(az);
		// staircase(4);
		// miniMaxSum(az);
		// timeConversion("07:05:45AM");
		// alternatingCharacters("AABBB");

		int[][] t = { { 1, 2, 3, 4, 5 }, { 1, 2, 3 } };
		// countSubstrings("abca",t);
		// permutation(); Not able to
		// countApplesAndOranges(7,10,4,12,az1,az2);
		// System.out.println(kangaroo(0,3,4,2));
		// System.out.println(kangaroo(0,2,5,3));
		// encryption("ashleyfsdf");
		// sequreBox();
		System.out.println(minimumNumber(5, "4700	"));
	}

	static int minimumNumber(int n, String password) {
		int count =0;
		String C=".*[A-Z].*",S=".*[a-z].*",L= "{6,99}",N=".*[0-9].*",SP=".*[!@#$%^&*()-+].*";
		if(!password.matches(C))
			count++;
		if(!password.matches(S))
			count++;
		if(!password.matches(N))
			count++;
		if(!password.matches(SP))
			count++;
		if((password.length() < 6))
			count =6-password.length();
		
		
		return count;
	}

	public static void sequreBox() {
		int[][] t = new int[5][5];
		int number = 5;
		int n1 = 1;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				t[i][j] = 0;
				n1++;
			}
		}
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(t[i][j]);
			}
			System.out.println();
		}

		System.out.println("hhhh");

		int high = number - 1;
		int low = 0;
		int n = 1;
		int count = (int) number / 2 + 1;

		for (int i = 0; i < count; i++) {
			for (int j = low; j < high + 1; j++) {
				t[i][j] = n;
				n++;
			}
			for (int j = low + 1; j < high + 1; j++) {
				t[j][high] = n;
				n++;
			}
			for (int j = high - 1; j < low - 1; j--) {
				t[high][j] = n;
				n++;
			}
			for (int j = high - 1; j < low; j--) {
				t[j][low] = n;
				n++;
			}
			low = low + 1;
			high = high - 1;

		}

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(t[i][j]);
			}
			System.out.println();
		}

	}

	static String encryption(String s) {
		String v = s.replace(" ", "");
		String v1[] = v.split("");
		int b = (int) Math.sqrt(v.length());
		// System.out.println(b+" "+(b+1));
		String t[] = {};
		int count = 0;
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b + 1; j++) {
				// t[i] = t[j] +v1[count];
				if (v1.length > count) {
					t[i] = t[i] + v1[count];
					System.out.println(v1[count]);
				}
				count++;
			}
		}
		return "";

	}

	/*
	 * static String appendAndDelete(String s, String t, int k) { String result
	 * ="NO"; Math.sqrt(a)
	 * 
	 * return "";
	 * 
	 * }
	 */

	static String kangaroo(int x1, int v1, int x2, int v2) {
		String result = "NO";
		for (int i = 1; i <= 1000; i++) {
			if (10000 < x1 || 10000 < x2 || 10000 < v1 || 10000 < v2) {
				result = "NO";
			} else {
				if ((v1 * i) + x1 == (v2 * i) + x2) {
					result = "YES";
				}
			}
		}
		return result;
	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int countA = 0, countB = 0;
		for (int i = 0; i < apples.length; i++) {
			apples[i] = apples[i] + a;
			if (apples[i] >= s && apples[i] <= t)
				countA = countA + 1;
		}
		for (int i = 0; i < oranges.length; i++) {
			oranges[i] = oranges[i] + b;
			if (oranges[i] >= s && oranges[i] <= t)
				countB = countB + 1;
		}
		System.out.println(countA);
		System.out.println(countB);

	}

	static int fact(int a) {
		if (a == 0)
			return 1;
		else
			return a * fact(a - 1);
	}

	static void permutation() {
		String a = "ab";
		// System.out.println(factorial(a.length()));
		System.out.println(fact(a.length()) / fact(a.length()) * (a.length() - a.length()) + "     ");
	}

	static int[] countSubstrings(String s, int[][] queries) {
		String a = "ab";
		Map m = new HashMap<String, String>();
		String[] t = a.split("");
		for (String q : t)
			m.put(q, "1");
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; i < a.length(); i++) {

			}
		}

		return null;
	}

	static int alternatingCharacters(String s) {
		String[] ar = s.split("");
		String t = ar[0];
		int count = 0, i = 0;
		for (String v : ar) {
			if (i != 0) {
				if (t.equalsIgnoreCase(v)) {
					count++;
				} else {
					t = v;
				}
			} else {
				i = 1;
			}
		}
		return 0;

	}

	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		String[] v = s.split(":");
		String m = v[2].substring(2, 4), out = "";
		if (m.equalsIgnoreCase("am")) {
			if (v[0].equalsIgnoreCase("12")) {
				// out ="00:00:00";
				out = "00" + ":" + v[1] + ":" + v[2].substring(0, 2);
			} else {
				out = v[0] + ":" + v[1] + ":" + v[2].substring(0, 2);
			}
		} else {
			out = 12 + Integer.valueOf(v[0]) + ":" + v[1] + ":" + v[2].substring(0, 2);
		}
		return out;

	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(0);
		for (int j = 0; j < a.size(); j++) {
			if (a.get(j) > b.get(j)) {
				l.add(0, l.get(0) + 1);
			} else if (b.get(j) > a.get(j)) {
				l.add(1, l.get(1) + 1);
			}
		}

		return l;

	}

	static void miniMaxSum(int[] arr) {
		int c = 0, sumA = 0, sumB = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < 4)
				sumA = sumA + arr[i];
			if (i != 0)
				sumB = sumB + arr[i];

		}
		System.out.println(sumA + " " + sumB);

	}

	static void staircase(int n) {
		// int k =n-1;
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("#");
			}

			System.out.println();
		}

	}

	static void plusMinus(int[] arr) {
		int p = 0, n = 0, z = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				p++;
			else if (arr[i] < 0)
				++n;
			else
				z++;

		}

		System.out.format("%.4f", (double) p / (double) arr.length);
		System.out.println("");
		System.out.format("%.4f", (double) n / (double) arr.length);
		System.out.println("");
		System.out.format("%.4f", (double) z / (double) arr.length);
		System.out.println("");
	}

	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> mp = new TreeMap<Integer, Integer>();
		int count = 98765;
		for (int i : arr) {
			if (mp.containsKey(i)) {
				mp.put(i, ((int) mp.get(i) + 1));
			} else {
				mp.put(i, 1);
			}
		}
		for (int j : mp.keySet()) {
			if (count == 98765)
				count = j;
			else {
				if (mp.get(count) < mp.get(j))
					count = j;
			}
		}
		return count;

	}

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar[i] + ar[j]) % k == 0) {
					count++;
				}
			}
		}

		return count;

	}

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {
		String day = "13.09." + year;
		// if(year % 400 ==0 || (year %4==0 && year %100 !=0))
		if ((year % 4 == 0))
			day = "12.09." + year;

		return day;

	}

	static void bonAppetit(List<Integer> bill, int k, int b) {
		int sum = 0;
		bill.remove(k);
		for (int i : bill) {
			sum += i;
		}
		sum = sum / 2;
		if (sum == b)
			System.out.println("Bon Appetit");
		else
			System.out.println(b - sum);

	}

}
