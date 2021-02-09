package org.example.herokuapp;

import org.example.pages.EmailSentPage;
import org.example.pages.ResetPasswordPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static org.example.pages.Commons.BASE_URL;

public class ForgotPassword {

    @Test
    public void resetPasswordPositive() {
        ResetPasswordPage resPwdPage = open(BASE_URL + "/forgot_password", ResetPasswordPage.class);
        EmailSentPage sentPage = resPwdPage.inputEmail("test@test.com");
        sentPage.confirmationText().shouldHave(text("Your e-mail's been sent!\n"));
    }
}
