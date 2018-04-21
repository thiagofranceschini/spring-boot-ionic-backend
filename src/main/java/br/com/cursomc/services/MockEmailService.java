package br.com.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService{

	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage message) {
		LOG.info("***Simulando o envio de E-mail.***");
		LOG.info(message.toString());
		LOG.info("***EMAIL ENVIADO!***");
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("***Simulando o envio de E-mail HTML.***");
		LOG.info(msg.toString());
		LOG.info("***EMAIL HTML ENVIADO!***");
		
	}

}
