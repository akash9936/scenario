package Scenario;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestAndSmallestNumber {
	public static void main(String[] args) {
		int a[]= {12,-43,26,80,-10};
		int largest=a[0];
		int smallest=a[0];
		for(int i=1; i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			else if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println("Array list is"+Arrays.toString(a));
		System.out.println("Largest number is "+largest);
		System.out.println("Largest number is "+smallest);
	}
}