package InT;

public class ArrReturn {
	static int[] makeArray() {
		int[] temp = {0, 1, 2, 3};
		return temp;
	}
	public static void main(int[] args) {
		int iArr[] = new int[4];
		iArr = makeArray();

		for ( int i = 0; i < iArr.length; i++ ) {
			System.out.print(iArr[i]+ " ");
		}
		for ( int i = 0; i < args.length; i++ ) {
			System.out.print(args[i]+ " ");
		}
	}
}