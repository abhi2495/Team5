package com.example.demo.utils;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class PushEmailNotificationUtil {

    public static final String SENDER_EMAIL = "testloanapp123@gmail.com";
    public static final String SENDER_LOGIN_ID = "testloanapp123@gmail.com";
    public static final String SENDER_PASSWORD = "testloanapp123.123";
    public static final String SENDER_NAME = "Remo Rides Admin";
    
    static void pushEmail(String receiver,String loanStatus) throws Exception {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.debug", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.localhost", "yoursite.com");

        Session s = Session.getInstance(props, null);
        s.setDebug(true);

        MimeMessage message = new MimeMessage(s);

        InternetAddress from = new InternetAddress(SENDER_EMAIL, SENDER_NAME);
        InternetAddress to = new InternetAddress(receiver);

        message.setSentDate(new Date());
        message.setFrom(from);
        message.addRecipient(Message.RecipientType.TO, to);

        message.setSubject("Loan Status");
        message.setContent("Your loan is "+loanStatus, "text/plain");

        Transport tr = s.getTransport("smtp");
        tr.connect("smtp.gmail.com", SENDER_LOGIN_ID, SENDER_PASSWORD);
        message.saveChanges();
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();
    }
}
