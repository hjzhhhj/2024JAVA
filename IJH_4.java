package JavaStudy;

public class IJH_4 {
	String id;
	String name;
	char grade;

	public IJH_4(String id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
}

class Manager extends IJH_4 {
	private int managementAllowance;

	public Manager(String id, String name, char grade, int managementAllowance) {
		super(id, name, grade);
		this.managementAllowance = managementAllowance;
	}
}

class SalesMan extends IJH_4 {
	private int salesAllowance;

	public SalesMan(String id, String name, char grade, int salesAllowance) {
		super(id, name, grade);
		this.salesAllowance = salesAllowance;
	}
}

class Temporary extends IJH_4 {
	private int performanceAllowance;
	private int contractPeriod;

	public Temporary(String id, String name, char grade, int performanceAllowance, int contractPeriod) {
		super(id, name, grade);
		this.performanceAllowance = performanceAllowance;
		this.contractPeriod = contractPeriod;
	}
}

class Main {
	public static void main(String[] args) {
		String data[][] = {
				{"MCTE11", "고영희", "D", "40", "5"},
				{"MCRS12", "도민준", "A", "50"},
				{"MCRM13", "채송화", "C", "30"},
				{"MCRM14", "강연주", "B", "40"}
		};

		IJH_4 psm[] = new IJH_4[data.length];

		for (int i = 0; i < data.length; i++) {
			String id = data[i][0];
			String name = data[i][1];
			char grade = data[i][2].charAt(0);
			char thirdChar = id.charAt(3);

			if (thirdChar == 'R') {
				int managementAllowance = Integer.parseInt(data[i][3]);
				psm[i] = new Manager(id, name, grade, managementAllowance);
			} else if (thirdChar == 'S') {
				int salesAllowance = Integer.parseInt(data[i][3]);
				psm[i] = new SalesMan(id, name, grade, salesAllowance);
			} else if (thirdChar == 'T') {
				int performanceAllowance = Integer.parseInt(data[i][3]);
				int contractPeriod = Integer.parseInt(data[i][4]);
				psm[i] = new Temporary(id, name, grade, performanceAllowance, contractPeriod);
			}
		}


		for (IJH_4 person : psm) {
			System.out.println(person.getClass().getSimpleName() + ": " + person.name);
		}
	}
}
