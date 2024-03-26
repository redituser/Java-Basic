package Main;

	import java.util.Random;

	public class ReversArray {

	   public static void main(String[] args) {
	      int[] numArr = { 0, 1, 2, 3, 4 };

	      reverseArray(numArr);

	      displayArray(numArr);
	      
	   }
	   
	   
	     static int[] RandomArray(int size) {
	     
	           int[] randomArr = new int[size];
	           Random random = new Random();
	           for (int i = 0; i < size; i++) {
	               randomArr[i] = random.nextInt(100); 
	           }
	           return randomArr;
	     }
	   static void reverseArray(int[] numArr) {
	      for (int i = 0; i < numArr.length / 2; i++) {
	         swapArr(numArr, i, numArr.length - 1 - i);

	      }
	   }

	   static void reverseArray2(int[] numArr) {
	      for (int i = 0, j = numArr.length; i < numArr.length - 1; i++) {
	         swapArr(numArr, i, j);
	      }
	   }

	   static void swapArr(int[] numArr, int source, int target) {
	      int temp = numArr[source];
	      numArr[source] = numArr[target];
	      numArr[target] = temp;

//	      int a = numArr[source];
//	      int b = numArr[target];
//	      int temp = a;
//	      a = b;
//	      b = temp;
	   }

	   static void displayArray(int[] numArr) {

	      for (int i = 0; i < numArr.length; i++) {
	         System.out.print(numArr[i] + " ");
	      }
	      System.out.println();

	   }
	   }

