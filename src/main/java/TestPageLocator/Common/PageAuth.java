package TestPageLocator.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAuth {

    WebDriver driver;
    public PageAuth(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//body")
    public WebElement Body;
    /**
     *login and edit, crutch button
     */
    @FindBy(id = "page--login")
    private WebElement UserName;
    @FindBy(id = "page--password")
    private WebElement Password;
    @FindBy(id = "page--btnSubmit")
    private WebElement SignInButton;
    /**
     *Login auth
     */
    public PageAuth typeUsername(String username){ UserName.sendKeys(username); return this;  }
    public PageAuth typePassword(String password){ Password.sendKeys(password); return this;  }
    public PageAuth clickButton(){ SignInButton.click(); return this; }
    public PageAuth Login(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        this.clickButton();
        return this;
    }
}
