package io.github.publications.publicationsapi.application.users;

import io.github.publications.publicationsapi.application.jwt.InvalidTokenException;
import io.github.publications.publicationsapi.domain.service.EmailService;
import io.github.publications.publicationsapi.domain.service.UserService;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {
    private final JavaMailSender javaMailSender;

    private final UserService userService;

    @Value("${BASE_URL}")
    private String baseUrl;

    @Override
    public boolean sendEmail(String email) {
        try{
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");

            var token = userService.authenticate(email, null);

            String htmlMsg = "<p>Olá!</p>" +
                    "<p>Alguém (provavelmente você) pediu que enviássemos um email de recuperação de senha. " +
                    "Se não foi você, pode ignorar essa mensagem. Mas se foi, clique no link abaixo para prosseguir:</p>" +
                    "<p><a href=\"" + baseUrl + "/reset_pw?reset=" + token.getAccessToken() + "\" target=\"_blank\">Recuperar ou trocar a senha</a></p>" +
                    "<p>Equipe L a w S c o p e</p>";

            helper.setText(htmlMsg, true); // 'true' indica que o conteúdo é HTML
            helper.setTo(email);
            helper.setSubject("L a w S c o p e - Redefinir senha");

            javaMailSender.send(mimeMessage);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
}
