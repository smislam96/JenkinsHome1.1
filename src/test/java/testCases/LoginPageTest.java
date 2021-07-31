package testCases;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.DataBasePage;
import page.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpageObj;
	@BeforeMethod
	public void setUp() {
		initializeDriver();
		loginpageObj = PageFactory.initElements(driver, LoginPage.class);
	}

	@Test(priority=1)
	public void loginTest() throws ClassNotFoundException, SQLException, InterruptedException, IOException {
		loginpageObj.enterUserName(DataBasePage.getData("username"));
		String uName=DataBasePage.getData("username");
		System.out.println("username: " + uName);  
		Thread.sleep(2000);

		loginpageObj.enterPassword(DataBasePage.getData("password"));
		String pass=DataBasePage.getData("password");
		System.out.println("password: "+ pass);
		Thread.sleep(2000);
		loginpageObj.clickSignInButton();

		takeScreenShotAtEndofTest();
	}

}
