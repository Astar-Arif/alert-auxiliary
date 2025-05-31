package service.email.implementation;

import com.mailersend.sdk.MailerSendResponse;
import pojo.EmailFormat;
import pojo.Pair;

import java.util.Map;

public class MailerSendService {

    private static final String SENDER_EMAIL = "astar@test-zkq340epxpkgd796.mlsender.net";
    private static final String SENDER_NAME = "astar";

    public static Map<String, Object> send(EmailFormat emailFormat) {
        com.mailersend.sdk.emails.Email email = new com.mailersend.sdk.emails.Email();
        email.setFrom(SENDER_NAME, SENDER_EMAIL);
        email.addRecipient(emailFormat.getRecipientName(), emailFormat.getRecipientEmail());
        for (Pair<String, String> ele : emailFormat.getCarbonCopy()){
            email.AddCc(ele.getLeft(), ele.getRight());
        }
        email.setSubject(emailFormat.getTitle());
        email.setPlain(emailFormat.getContent());
        com.mailersend.sdk.MailerSend ms = new com.mailersend.sdk.MailerSend();
        ms.setToken((String) emailFormat.getServiceProviderToken());
        MailerSendResponse response;
        try {
            response = ms.emails().send(email);
            System.out.println(response.messageId);
        } catch (com.mailersend.sdk.exceptions.MailerSendException e) {
            e.printStackTrace();
        }
        return null;
    }

    private EmailSuccessResponse constructSuccess() {
        return null;
    }

    private EmailFailResponse constructFail() {
        return null;
    }
}
