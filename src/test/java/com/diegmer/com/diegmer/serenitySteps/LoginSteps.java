package com.diegmer.com.diegmer.serenitySteps;

import com.diegmer.features.LoginGmailPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by diego.merino on 27/01/2017.
 */
public class LoginSteps {

    private LoginGmailPage loginPage;

    @Step
    public void openGmailPage() {
        loginPage.open();
    }

    @Step
    public void inputMail(String email) {
        loginPage.inputEmail(email);
    }

    @Step
    public void clickNext() {
        loginPage.clickNext();
    }
}
