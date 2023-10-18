package Class23;

public class User {// 1class/2field private/ 3constructor is option/4create getter and setter intelij
    // do for you /right click generate and constructor to get both hold shift and select setter getter ok
    private String name;
    private int age;
    private String userName;
    private String password;

    public User(String name, int age, String userName, String password) {
        setAge(age);
        setName(name);
        setUserName(userName);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}