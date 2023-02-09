package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Input max limit number:");
		int n = in.nextInt();
		
		boolean [] sieve = new boolean [n] ;
		for ( int i=2 ; i < n; i++) {
			for (int j = i * 2 ; j < n ; j += i) {
				sieve[j] = true;
			}
		
		}
		for ( int i=2 ; i < n; i++) {
			if (sieve[i] == false) {
				System.out.println(i +" ");
			}
		}
	}
}
