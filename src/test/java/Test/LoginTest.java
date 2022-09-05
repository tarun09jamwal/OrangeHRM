package Test;


public class LoginTest extends BaseClass
{
    public static void main(String[] args) throws InterruptedException {
        SetUp();
        pageFactory.loginPage().login();
//        Close();
    }
}
