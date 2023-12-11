package apps.ucu.edu.ua.task2;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }
}
