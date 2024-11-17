package JavaStudy;

public class AppendExam {
	public static void main(String args[]) {
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer st1 = null;
		StringBuffer st2 = null;
		st1 = sb1.append(" Project");
		st2 = sb1.append(sb2);
		System.out.println("sb1 = "+sb1);
		System.out.println("sb2 = "+sb2);
		System.out.println("st1 = "+st1);
		System.out.println("st2 = "+st2);
		System.out.println();
	}
}
