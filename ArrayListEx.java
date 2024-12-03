package InT;

import java.util.*;

public class ArrayListEx {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            arr.add(sc.next());
        }

        System.out.println(arr);
        
    }
}
