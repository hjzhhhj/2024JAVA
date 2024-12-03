package InT;

import java.util.Arrays;
public class IrregularArray {
	public static void main(String args[]) {
		int[][] arr = new int[4][];
		int value = 10;
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		
		arr[0][0] = 10;
		arr[0][1] = 11;
		arr[0][2] = 12;
		arr[1][0] = 20;
		arr[1][1] = 21;
		arr[2][0] = 30;
		arr[2][1] = 31;
		arr[2][2] = 32;
		arr[3][0] = 40;
		arr[3][1] = 41;
		
		System.out.print(Arrays.deepToString(arr));
	}
}
