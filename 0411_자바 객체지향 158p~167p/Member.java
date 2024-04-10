package test;

public class Member {
    private String name;
    private String id;
    private String password;
    private int age;

    // 모든 회원 정보를 사용하여 객체를 생성하는 생성자
    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    // 이름에 대한 getter와 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 아이디에 대한 getter와 setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 암호에 대한 getter와 setter
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 나이에 대한 getter와 setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
