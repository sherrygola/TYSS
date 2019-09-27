package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.Base;
import Generic.Utils;
import Pages.LoginPage;

public class TestLogin extends Base {

	@Test
	public void enterLogindtls() throws IOException, Exception {
		LoginPage lp = new LoginPage(driver);
	
		lp.loginDtls("admin", "manager");
		
		

	}
	

}
