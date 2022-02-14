package com.williamdsw.cursomodelagemconceitual.services;

import javax.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * @author William
 */
public class SmtpEmailService extends AbstractEmailService
{
    // ------------------------------------------------------------------------------------//
    // CAMPOS
    
    private static final Logger LOG = LoggerFactory.getLogger (SmtpEmailService.class);
    
    @Autowired
    private MailSender mailSender;
    
    @Autowired
    private JavaMailSender javaMailSender;
    
    // ------------------------------------------------------------------------------------//
    // IMPLEMENTADOS
    
    @Override
    public void sendEmail (SimpleMailMessage message)
    {
        LOG.info ("Enviando email...");
        mailSender.send (message);
        LOG.info ("Email enviado!");
    }

    @Override
    public void sendHtmlEmail (MimeMessage message)
    {
        LOG.info ("Enviando email html...");
        javaMailSender.send (message);
        LOG.info ("Email enviado!");
    }
}