package apps.ucu.edu.ua.task2;

public class BirthdayMail implements MailCode {
    @Override
    public String generate(Client client) {
        return "Happy birthday!";
    }
}
