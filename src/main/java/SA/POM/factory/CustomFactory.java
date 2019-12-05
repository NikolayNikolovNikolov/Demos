package SA.POM.factory;

import SA.POM.*;

import org.openqa.selenium.WebDriver;

public class CustomFactory {
	

	
	public static PageBase getInstance(PageName name, WebDriver driver) {
		
		switch (name) {
			case EnterPost:
				return new EnterPostClass(driver);
			case HomePage:
				return new HomePageClass(driver);
			case LoginPage:
				return new LoginPageClass(driver);
			case NewsFeedPage:
				return new NewsFeedPageClass(driver);
			case UserPrivateNFP:
				return new UserPrivateNFPClass(driver);
			case RegistrationPage:
				return  new RegistrationPageClass(driver);
			case ProfileAdministrationPage:
				return new ProfileAdministrationPageClass(driver);


		default:
			throw new RuntimeException("Invalid Page Name");
		}
		
	}

}
