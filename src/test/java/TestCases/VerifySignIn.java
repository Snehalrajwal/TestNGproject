package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import PageObjectModel.SignInPageObject;
import Resources.BaseClass;

public class VerifySignIn extends BaseClass {

	 @Test
	 public void enterCredientials(){
	  
	 SignInPageObject spo = new  SignInPageObject (driver);
	  spo.enterUserName().sendKeys("rahul");
	  spo.enterPassword().sendKeys("secure123");
	  spo.clickOnLogin().click();
	 
	}
}
/*Assert---1.Hard Assert - 
           2.soft Assert - 
*/