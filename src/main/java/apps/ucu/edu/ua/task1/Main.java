package apps.ucu.edu.ua.task1;

public class Main {
    public static void main(String[] args) {
        User someone = User.builder().age(22).occupation("hmmm").name("what").build();
        System.out.println(someone);
    }
}
