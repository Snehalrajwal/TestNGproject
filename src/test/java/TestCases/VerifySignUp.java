package TestCases;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.SignInPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;

@Test
public class VerifySignUp extends BaseClass{

		public void signUp() throws InterruptedException {
			//Sign In Page Objects
			SignInPageObject spo = new SignInPageObject(driver);
			spo.openSignupPage().click();
			Thread.sleep(5000);
			
			//Sign Up Page Objects
			SignUpPageObject sup = new SignUpPageObject(driver);
			sup.firstNamef().sendKeys("Snehal");
			sup.lastNamel().sendKeys("Rajwal");
			sup.workEmailWE().sendKeys("sweetsnehu5264@gmail.com");
			
			//Selecting from dropdownList Job Title
			Select s1 = new Select(sup.jobTitleJT());
			s1.selectByIndex(1);
			
			sup.companyC().sendKeys("Amazon");
			
			//Selecting from dropdownList Employees
			Select s2 = new Select(sup.employeesE());
			s2.selectByIndex(2);
			
			sup.phoneP().sendKeys("8600933961");
			
			//Selecting from Dropdown list Country/Region		
			Select s3 = new Select(sup.countryRegionCR());
			s3.selectByIndex(23);
			
			sup.mainServiceAgreementMA().click();
							
			}
	
			}
/*SoftAssert sp =new SoftAssert();     //soft assert
sp.assertEquals (expected,actual);   */

	

	
	
	
	
	


