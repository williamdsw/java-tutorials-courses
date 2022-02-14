package advanced.email;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * @author William
 */
public class SendEmailDemo {
    public static void main(String[] args) {
        String message = sendEmail() ? "Email sent!" : "Error on sending email!";
        System.out.println(message);
    }

    private static boolean sendEmail() {
        // Params
        final String EMAIL_HOST = "your.provider";
        final int PORT = 0; // your provider PORT
        final String SENDER = "your@email.com";
        final String PASSWORD = "your.password";
        final String[] RECIPIENTS = { "destiny1@email.com", "destiny2@email.com" /* ... */ };
        final String[] FILE_PATHS = { "file1.txt", "file2.xml", "file3.mp3" /* ... */ };

        try {
            // Mail properties
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.ssl.trust", "*");
            properties.put("mail.smtp.host", EMAIL_HOST);
            properties.put("mail.smtp.port", PORT);

            Authenticator authenticator = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(SENDER, PASSWORD);
                }
            };

            Session session = Session.getInstance(properties, authenticator);

            // Mail parameters
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(SENDER));

            for (String email : RECIPIENTS) {
                message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            }

            message.setSubject("This is the Subject line!");

            // Parts
            BodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText("This is the actual message!");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);

            // Files - attachments
            for (String path : FILE_PATHS) {
                File file = new File(path);
                if (file.exists()) {
                    bodyPart = new MimeBodyPart();
                    DataSource dataSource = new FileDataSource(file);
                    bodyPart.setDataHandler(new DataHandler(dataSource));
                    bodyPart.setFileName(file.getName());
                    multipart.addBodyPart(bodyPart);
                }
            }

            message.setContent(multipart);
            Transport.send(message);
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
}