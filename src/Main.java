import May9.LoginGenerator;
import May9.User;

public class Main {
    public static void main(String[] args) {
        User Babek=new User("Babek", "Asadli",20);
        System.out.println(Babek.getName()+" "+Babek.getSurname()+" "+Babek.getAge());

        LoginGenerator login = LoginGenerator.loginGenerator(Babek);
        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());
    }
}