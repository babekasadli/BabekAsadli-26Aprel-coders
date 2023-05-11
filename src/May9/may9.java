package May9;

public class may9 {
    public static void main(String[] args) {
        User Babek=new User("Babek", "Asadli",20);
        System.out.println(Babek.getName()+" "+Babek.getSurname()+" "+Babek.getAge());

        LoginGenerator login = LoginGenerator.loginGenerator(Babek);
        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());

        QarsiliqliSade ededler1=new QarsiliqliSade(21,16);
        QarsiliqliSade ededler2=new QarsiliqliSade(12,34);
        QarsiliqliSade ededler3=new QarsiliqliSade(37,49);

        int[] arr = {45, 22, 73, 34, 50, 16, 33};
        massivtask5 task5 = new massivtask5(arr);
    }
}
