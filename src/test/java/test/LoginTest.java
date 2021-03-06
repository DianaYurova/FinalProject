package test;

import context.Context;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static context.Context.profilePage;

public class LoginTest extends BaseTest {

    @Test(groups = {"Positives"})
    public void loginTest() {
        String email = "diankatestmail@gmail.com";
        String password = "Dianka123";
        Context.login(email, password);
        Assert.assertTrue(profilePage.isDisplayedBox());
    }

}
