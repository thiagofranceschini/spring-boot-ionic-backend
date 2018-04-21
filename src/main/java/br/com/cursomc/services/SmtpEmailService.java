package br.com.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import br.com.cursomc.services.AbstractEmailService;

public class SmtpEmailService extends AbstractEmailService{

	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	private static final Logger LOG = LoggerFactory.getLogger(SmtpEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage message) {
		LOG.info("***Enviando E-mail.***");
		mailSender.send(message);
		LOG.info("***EMAIL ENVIADO!***");
		
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("***Enviando E-mail HTML.***");
		javaMailSender.send(msg);
		LOG.info("***EMAIL ENVIADO!***");
	}
	
	

}
