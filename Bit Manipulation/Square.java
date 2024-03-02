/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
// java program for Simple solution to calculate square without
// using * and pow()


// This code is contributed by Aditya Verma
public class Square {
	
	public static int square(int num)
	{
		if (num < 0)
			num = -num;
		int power = 0, result = 0;
		int temp = num;

		while (temp > 0) {
			if ((temp & 1) > 0) {
				result += (num << power);
			}
			power++;
			temp = temp >> 1;
		}
		return result;
	}

	public static void main(String[] args) {
		// Function calls
		for (int n = 10; n <= 15; ++n)
			System.out.println("n = " + n + ", n^2 = " + square(n));
	}
}

// The code is contributed by Nidhi goel. 

