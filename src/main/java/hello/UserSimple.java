package hello;

public class UserSimple {
    String name;
    String email;
    int age;
    boolean isDeveloper;

    public UserSimple(String name, String email, int age, boolean isDeveloper) {
        this.name= name;
        this.email= email;
        this.age= age;
        this.isDeveloper= isDeveloper;
    }
    public String getName(){
        return name;
    }

    public String getGmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public boolean getIsDeveloper(){
        return isDeveloper;
    }
}