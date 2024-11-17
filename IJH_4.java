public class Employee {
    String id;
    String name;
    char grade;

    public Employee(String id, String name, char grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}

class Manager extends Employee{
    private int managementAllowance;

    public Manager(String id, String name, char grade, int managementAllowance){
        super(id, name, grade);
        this.managementAllowance = managementAllowance;
    }
}

class SalesMan extends Employee{
    private int SalesAllowance;

    public SalesMan(String id, String name, char grade, int SalesAllowance){
        super(id, name, grade);
        this.SalesAllowance = SalesAllowance;
    }
}

class Temporary extends Employee{
    private int PerformanceAllowance;
    private int ContractPeriod;

    public Temporary(String id, String name, char grade, int PerformanceAllowance,int ContractPeriod){
        super(id, name, grade);
        this.PerformanceAllowance = PerformanceAllowance;
        this.ContractPeriod = ContractPeriod;
    }
}

class Main{
    public static void main(String[]  args){
        String data[][] = {
                {"MCTE11", "고영희","D","40","5"},
                {"MCRS12", "도민준","A", "50"},
                {"MCRM13", "채송화","C", "30"},
                {"MCRM14", "강연주","B", "40"}};

        Employee psm[] = new Employee[data.length];

        for(int i=0; i< data.length; i++){
            String id = data[i][0];
            String name = data[i][1];
            char grade = data[i][2].charAt(0);

            char thirdChar = id.charAt(3);

            ;
            if(thirdChar == "R"){
                employee[i] = new Manager(id, name, grade) --
            }
        }


    }
}