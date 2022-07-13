import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartTest {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        // wd.get("https://ticket-service-69443.firebaseapp.com");
        wd.navigate().to("https://ticket-service-69443.firebaseapp.com/");
    }
    @Test
    public void testName(){}
    @AfterMethod
    public void postCondition() {

        // wd.quit();
    }
}
