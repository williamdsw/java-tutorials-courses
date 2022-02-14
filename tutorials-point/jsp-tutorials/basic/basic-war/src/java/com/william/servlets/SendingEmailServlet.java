package com.william.servlets;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author William
 */
@MultipartConfig
@WebServlet(name = "SendingEmailServlet", urlPatterns = { "/SendingEmailServlet" })
public class SendingEmailServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = "";

        try {
            String enctype = request.getContentType();
            String to = request.getParameter("to");
            String from = request.getParameter("from");
            String subject = request.getParameter("subject");
            String text = request.getParameter("text");
            List<Part> attachments = (List) request.getParts();

            if (enctype.contains("multipart/form-data")) {
                String host = "smtp.gmail.com";
                Properties properties = System.getProperties();
                properties.setProperty("mail.user", "your@email.com");
                properties.setProperty("mail.password", "your-password");
                properties.setProperty("mail.smtp.host", host); // GMAIL

                Session mailSession = Session.getDefaultInstance(properties);

                // Message properties
                MimeMessage message = new MimeMessage(mailSession);
                message.setFrom(new InternetAddress(from));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject(subject);

                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setText(text);

                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);

                if (attachments != null && !attachments.isEmpty()) {
                    for (Part part : attachments) {
                        if (part.getName().equals("files")) {
                            messageBodyPart = new MimeBodyPart();

                            DataSource dataSource = new ByteArrayDataSource(part.getInputStream(),
                                    part.getContentType());

                            messageBodyPart.setDataHandler(new DataHandler(dataSource));
                            messageBodyPart.setFileName(part.getName());
                            multipart.addBodyPart(messageBodyPart);
                        }
                    }
                }

                message.setContent(multipart);
                Transport.send(message);

                result = "Email sent...";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("SendingEmailServlet::98 --> " + ex.getMessage());
            result = "error: Unable to send email!";
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("sending-email.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
    // + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
