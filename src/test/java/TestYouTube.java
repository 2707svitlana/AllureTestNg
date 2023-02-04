import configuration.BaseClass;
import configuration.BaseProxy;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testObjects.YouTubePage;
import util.Screen;

import java.util.List;

public class TestYouTube extends BaseClass {


    @Description ("This test open page YouTube")
    @BeforeClass
    public void startTest() {
        driver.get("https://youtube.com");
    }

   @Issue("#_links")
    @Test(groups = {"smoke", "regresions"})

    public void test1() {
        driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("No war");
        driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.ENTER);

    }

    @AfterClass
    public void close(){
        driver.close();
    }
}









