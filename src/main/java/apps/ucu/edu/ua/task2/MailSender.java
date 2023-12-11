package apps.ucu.edu.ua.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    public static void sendMail(MailInfo mailInfo) throws MailjetSocketTimeoutException, MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("API_KEY", "API_SECRET_KEY", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource).property(Emailv31.MESSAGES, new JSONArray()
                .put(new JSONObject()
                .put(Emailv31.Message.FROM, new JSONObject()
                .put("Email", "mail05denis@gmail.com")
                .put("Name", "denhumen"))
                .put(Emailv31.Message.TO, new JSONArray()
                .put(new JSONObject()
                .put("Email", mailInfo.getClient().getEmail())
                .put("Name", mailInfo.getClient().getName())))
                .put(Emailv31.Message.SUBJECT, "Greetings from denhumen.")
                .put(Emailv31.Message.TEXTPART, "Another email")
                .put(Emailv31.Message.HTMLPART, mailInfo.generate())));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
