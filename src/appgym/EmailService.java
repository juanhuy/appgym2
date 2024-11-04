/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgym;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;


public class EmailService {
    public static void sendVerificationEmail(String recipientEmail, String subject, String msg) {
        String host = "smtp.gmail.com";
        String senderEmail = "emchiminh123@gmail.com";
        String password = "ltpcybzdkauirjon";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);
            //System.out.println("Verification email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
