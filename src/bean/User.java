package bean;

public class User {
    String name;
    int a;
    int b;

    public User(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
