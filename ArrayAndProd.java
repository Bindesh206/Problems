package week1;

/*
Given an array of integers, return a new array such that each element at index i 
of the new array is the product of all the numbers in the original array except the
one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be
[120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would 
be [2, 3, 6].
*/

public class ArrayAndProd {
    public static void main(String[] args) {
        int a[] = new int[]{ 3,2,1};
    int newa[] = new int[a.length];
   int mul=1;
    for (int i = 0; i <= a.length; i++)
      {
          try{
	mul = mul * a[i];
	}
	catch(ArrayIndexOutOfBoundsException ae){}
      }
      for(int i=0;i<a.length;i++){
          newa[i] = mul/a[i];
          System.out.print ("  " + newa[i]);
      }
    }
}
