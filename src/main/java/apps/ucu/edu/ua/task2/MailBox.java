package apps.ucu.edu.ua.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public MailBox(){
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void removeMailInfo(MailInfo mailInfo) {
        infos.remove(mailInfo);
    }

    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailInfo email: infos){
            MailSender.sendMail(email);
        }
    }
}
