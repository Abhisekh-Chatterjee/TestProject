/*
 * The early Greeks have made great contributions to the field of mathematics. Among the great mathe-
maticians of this times were Euclid and Pythagoras. The 23 volume Elements of Euclid is still regarded
as on of the cornerstones in the study of mathematics.
Euclid made an important contributions to a problem posed by Pythagoras - that of finding all
the perfect numbers. The number 6 is called a perfect number because 6 = 1 + 2 + 3, the sum of all
its proper divisors, (i.e. divisors less than 6). Another example of a perfect number is 28, because
28 = 1 + 2 + 4 + 7 + 14, and 1, 2, 4, 7 and 14 are the divisors of 28 less than 28.
In Book IX of the ‘Elements’ Euclid found all the even perfect numbers. (It has been proven later
much later, in the 20-th century that all perfect numbers are even.) Euclid proved that an even number
is perfect if it has the form
2^(p−1)*(2^p − 1)
where both p and 2^p − 1 are prime numbers.
Two thousand years later, Leonhard Euler proved the converse of Euclid’s theorem. That is every
even perfect number must be of Euclid’s type. For example, for 6 and 28, we have
6 = 2^(2−1)*(2^2 − 1), and 28 = 2^(3−1)*(2^3 − 1)
Perfect numbers are very rare. By 1975, only 24 perfect numbers have been discovered. The first
four perfect numbers are
6, 28, 496, and 8128
which correspond to the following values of p
2, 3, 5, and 7.
You would be given several integer numbers p, which would not necessarily be prime numbers. You
have to determine if 2^(p−1)*(2^p − 1) is a perfect number. The largest perfect number in this problem will
not exceed 233.
Input
The input contains two lines of integers. The first line contains the number of integers appearing on
the second line. The second line contains the values of p that should be tested.
Output
For each integer value to be tested output ‘Yes’ or ‘No’ on a line of its own. The output will be ‘Yes’
if the integer value p generates a perfect number and ‘No’ otherwise.
Sample Input
6
2,3,4,5,6,7
Sample Output
Yes
Yes
No
Yes
No
Yes
 */

package com.test.numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n = 6;
		Scanner sc = new Scanner(System.in);
		int num;
		boolean numPrime;
		boolean secondFactorPrime;
		int firstFactor;
		int secondFactor;
		for(int i = 0; i < n; i++) {
			System.out.print("Please enter any number : ");
			num = sc.nextInt();
			System.out.println();
			numPrime = isPrime(num);
			if(numPrime) {
				firstFactor = (int)Math.pow(2, (num-1));
				secondFactor = (int)Math.pow(2, num) - 1;
				secondFactorPrime = isPrime(secondFactor);
				if(secondFactorPrime) {
					if((firstFactor * secondFactor) % 2 == 0) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}
	}
	
	private static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		} else if(n == 2) {
			return true;
		} else {
			for(int i = 2; i < (n/2); i++) {
				if(n%i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
