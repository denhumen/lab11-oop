package apps.ucu.edu.ua.task2;

public class GiftMail implements MailCode{
    @Override
    public String generate(Client client) {
        return "It is Black Friday! Go get some discounts";
    }
}
