package service.email;

import pojo.EmailFormat;
import service.email.implementation.MailerSendService;
import java.util.List;
import java.util.Map;

public class EmailService {
    public static Map<String, Object> send(EmailFormat emailFormat) throws Exception {
        return switch (emailFormat.getServiceProvider()) {
            case MAILERSEND -> MailerSendService.send(emailFormat);
            default -> throw new Exception("Invalid Service Provider");
        };
    }
}
