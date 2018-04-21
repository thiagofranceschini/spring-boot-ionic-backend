package br.com.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage message);
}
