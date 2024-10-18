package JavaStudy;

public class MyFriendInfo {
    public String name;
    public int age;

    public MyFriendInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    public static void main(String[] args) {
        MyFriendDetailInfo MFDI = new MyFriendDetailInfo("김자바", 17, "미림마고", "010-0000-0000");
        
        System.out.println("이름 : "+MFDI.name);
        System.out.println("나이 : "+MFDI.age);
        System.out.println("주소 : "+MFDI.state);
        System.out.println("전화 : "+MFDI.number);
    }
}

class MyFriendDetailInfo extends MyFriendInfo {
    public String state;
    public String number;

    public MyFriendDetailInfo(String name, int age, String state, String number) {
        super(name, age); 
        this.state = state;
        this.number = number;
    }
}
