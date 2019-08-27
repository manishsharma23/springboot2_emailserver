package com.example.email.files;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

    private static Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private EmailService emailService;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("Spring Mail - Sending Email Attachment Configuration Example");

        Mail mail = new Mail();
        mail.setFrom("sharmam8250@gmail.com");
        mail.setTo("sharmam8250@gmail.com");
        mail.setSubject("Sending Email Attachment Configuration Example");
        mail.setContent("This tutorial demonstrates how to send an email with attachment using Spring Framework.");

        emailService.sendSimpleMessage(mail);
    }
}