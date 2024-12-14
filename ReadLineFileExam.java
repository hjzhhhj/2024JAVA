package JavaStudy;

import java.io.*;

class ReadLineFileExam {
	public static void main(String args[]) {
		String fname = "BufferInput.txt";
		try {
			FileReader fr = new FileReader(fname);
			BufferedReader br = new BufferedReader(fr);
			String s = " ";
			while((s = br.readLine()) != null ) {
				
			}
		}
	}
}
