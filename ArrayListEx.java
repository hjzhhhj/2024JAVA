package InT;

import java.util.*;

public class ArrayListEx {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<String>(); // 문자열만 삽입 가능한 컬렉션 생성
        // var a = new ArrayList<String>>();
        // ArrayList<String> a = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            arr.add(sc.next());
        }

        System.out.println(arr);
        
        int longestIndex = 0;
        
        for ( int i = 1; i < arr.size(); i++ ) {
        	
        }
        
    }
}
