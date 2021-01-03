
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;



public class Login  {
@Test
    public void loginOasis()  {

        WebDriver driver= DriverFactory.getDriver();
        driver.get("http://www.baidu.com/");

        driver.close();
        driver.quit();

}


}
