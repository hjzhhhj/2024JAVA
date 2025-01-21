package hi;

// 1116 정희진
abstract class SchoolMember {
    protected String id;
    protected String name;

    public SchoolMember(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void printInfo();
}

class Teacher extends SchoolMember {
    private String subject;
    private int experience;

    public Teacher(String id, String name, String subject, int experience) {
        super(id, name);
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public void printInfo() {
        System.out.printf("%-4s  %-6s  %-10s  %2d\n", id, name, subject, experience);
    }
}

class Student extends SchoolMember {
    private String major;
    private int year;

    public Student(String id, String name, String major, int year) {
        super(id, name);
        this.major = major.equals("D") ? "Designer" : major.equals("S") ? "Software" : major;
        this.year = year;
    }

    @Override
    public void printInfo() {
        String yearInfo = (year >= 1 && year <= 3) ? String.valueOf(year) : "Error(" + year + ")";
        System.out.printf("%-4s  %-6s  %-10s  %s\n", id, name, major, yearInfo);
    }
}

class Admin extends SchoolMember {
    private String role;
    private int experience;

    public Admin(String id, String name, String role, int experience) {
        super(id, name);
        this.role = role;
        this.experience = experience;
    }

    @Override
    public void printInfo() {
        System.out.printf("%-4s  %-6s  %-10s  %2d\n", id, name, role, experience);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        String[][] data = {
                {"MS1", "강서연", "D", "10"},
                {"MS2", "고주원", "S", "7"},
                {"MT1", "양민서", "영어", "21"},
                {"MA1", "송하준", "정보보호", "11"},
                {"MT2", "방서현", "운영체제", "25"},
                {"MS3", "김예준", "S", "3"},
                {"MT3", "이지민", "컴퓨터그래픽", "8"}
        };

        SchoolMember[] members = new SchoolMember[data.length];

        for (int i = 0; i < data.length; i++) {
            String id = data[i][0];
            String name = data[i][1];

            if (id.charAt(1) == 'T') {
                String subject = data[i][2];
                int experience = Integer.parseInt(data[i][3]);
                members[i] = new Teacher(id, name, subject, experience);
            } else if (id.charAt(1) == 'S') {
                String major = data[i][2];
                int year = Integer.parseInt(data[i][3]);
                members[i] = new Student(id, name, major, year);
            } else if (id.charAt(1) == 'A') {
                String role = data[i][2];
                int experience = Integer.parseInt(data[i][3]);
                members[i] = new Admin(id, name, role, experience);
            }
        }

        System.out.println("Teacher*************************");
        for (SchoolMember member : members) {
            if (member instanceof Teacher) {
                member.printInfo();
            }
        }

        System.out.println("\nStudent*************************");
        for (SchoolMember member : members) {
            if (member instanceof Student) {
                member.printInfo();
            }
        }

        System.out.println("\nAdmin*************************");
        for (SchoolMember member : members) {
            if (member instanceof Admin) {
                member.printInfo();
            }
        }
    }
}
