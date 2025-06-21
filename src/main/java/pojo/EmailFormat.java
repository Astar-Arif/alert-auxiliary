package pojo;

import service.email.EmailServiceProvider;

import java.util.List;

public class EmailFormat {
    private String title;
    private String recipientEmail;
    private String recipientName;
    private List<Pair<String, String>> carbonCopy;
    private String content;
    private String contentFormat;
    private EmailServiceProvider serviceProvider;
    private Object serviceProviderToken;

    public EmailFormat(
            String title, String recipient, String recipientName,
            List<Pair<String, String>> carbonCopy, String content,
            String contentFormat, EmailServiceProvider serviceProvider, Object serviceProviderToken
    ) {
        this.title = title;
        this.recipientEmail = recipient;
        this.recipientName = recipientName;
        this.carbonCopy = carbonCopy;
        this.content = content;
        this.contentFormat = contentFormat;
        this.serviceProvider = serviceProvider;
        this.serviceProviderToken = serviceProviderToken;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public List<Pair<String, String>> getCarbonCopy() {
        return carbonCopy;
    }

    public void setCarbonCopy(List<Pair<String, String>> carbonCopy) {
        this.carbonCopy = carbonCopy;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentFormat() {
        return contentFormat;
    }

    public void setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
    }

    public EmailServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(EmailServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Object getServiceProviderToken() {
        return serviceProviderToken;
    }

    public void setServiceProviderToken(Object serviceProviderToken) {
        this.serviceProviderToken = serviceProviderToken;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
