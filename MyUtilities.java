package ohnouh;
import java.util.Arrays;
import java.util.Scanner;
public class MyUtilities {
		Scanner ohyeah = new Scanner(System.in);
	public int[] inputValues() {
		System.out.println("Please enter array length:");
		int read = ohyeah.nextInt();
		int myArray[] = new int [read];
		System.out.println("Please enter array values");
		for (int i = 0; i < myArray.length; i++){
			myArray[i] = ohyeah.nextInt();
			
	}
		return myArray;
	}
	public String printValues(int[] a) {
		return Arrays.toString(a);
	}
	public void isInside(int [] a) {
		boolean check = false;
		System.out.println("Please type number to check in array");
		int input = ohyeah.nextInt();
		for (int i : a) {
			if (i == input) {
				System.out.println("It is inside the array");
				check = true;
				break;
				}
}
	}
	public void printType(int [] a) {
		int positive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		int zeros = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>=0) {
				positive += 1;
			}else {
				negative += 1;
			}
			if (a[i] % 2 == 0) {
				even += 1;
			}else {
				odd += 1;
			}if(a[i] == 0) {
				zeros += 1;
			}
			
	}
		System.out.println("Number of positive numbers are:" + positive);
		System.out.println("Number of negative numbers are:" + negative);
		System.out.println("Number of even numbers are:"+ even);
		System.out.println("Number of odd numbers are:"+ odd);
		System.out.println("Number of zeros numbers are:"+ zeros);
}
	public void sumProduct (int [] a) {
		int sum = 0;
		int mult = 1;
	    for (int value : a) {
	        sum += value;
	        mult = mult * value;
	    }
	    System.out.println("Sum of elements is: " + sum);
	    System.out.println("Total product of elements is: " + mult);
	}
	
	public void largestSmallest (int [] a) {
		int largest = 0;
		int smallest = a[0];
		for (int i = 0; i < a.length; i++){
			if(a[i]>largest) {
				largest = a[i];}
			if(a[i]<smallest) {
				smallest = a[i];}
		}
		System.out.println("Largest element is: " + largest);
		System.out.println("Smallest element is: " + smallest);
	}
	public void checkOrder (int[] a) {
		int reverse[] = new int[a.length];
			for (int i = a.length -1; i >= 0; i--){
				reverse[i]=a[a.length-1-i];
			}
			if(Arrays.toString(a).equals(Arrays.toString(reverse))){
				System.out.println("They are the same");
			}else System.out.println("They are not the same");
			
} public void splitArray (int[] a) {
	int newarr1[] = new int[a.length/2];
	int newarr2[] = new int[a.length/2];
		for (int i= 0; i<a.length;i++) {
			if(i <= a.length/2-1) {
				newarr1[i] = a[i];
				
			}else if(i >a.length/2-1) {
				newarr2[i-a.length/2] = a[i];
			}
				
		}
		
		
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(newarr1));
	System.out.println(Arrays.toString(newarr2));
}
	public void bigSplit (int [] a) {
		int newarr[] = new int[a.length+1];
		int largest = 0;
		int largestIndex=0;
		for (int i = 0; i < a.length; i++){
			if(a[i]>largest) {
				largest = a[i];
				largestIndex = i;
				
			}
			
		}
	    int secondLargest = 0;
	    for (int i = 0; i < a.length; i++){
			if(a[i] > secondLargest && a[i] < largest) {
				secondLargest = a[i];
				
			}
	    }
	    boolean reach = false;
	    for (int i = 0; i < newarr.length; i++){
			if(largestIndex==i){
				newarr[i] = secondLargest;
				i++;
				newarr[i] = largest-secondLargest;
				reach = true;
			}else {
				if(reach) newarr[i] = a[i-1];
				else newarr[i] = a[i];
			}
	    }
		System.out.println(Arrays.toString(newarr));
	}
	public void circularShift(int [] a) {
		int n = 1;
		for (int i= 0; i < n;i++){
			int last = a[a.length-1];
			 for(int j = a.length-1; j > 0; j--){ 
				 a[j] = a[j-1];  
			 }
			 a[0] = last;   
			}
		System.out.println(Arrays.toString(a));
	}
	public void arraySort(int []a) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}