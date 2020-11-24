package pages.EduRete;

import Utilities.Hooks;
import Utilities.ScreenShot;
import org.junit.Assert;
import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EdureteHomePage {
    WebDriver driver;
    ScreenShot screenShot;


    By googleSearchInputElement = By.xpath("//input[@name='q']");
    By searchTextResult=By.xpath("//*[@id='rso']/div[1]/div/div[1]/a/h3/span");
    By logoFindOnHomePage=By.xpath("//a[@href='https://edrete.com/']");
    By aboutUsTab=By.xpath("//a[@href='https://edrete.com/about-us/']");
    By planTablocator=By.xpath("//a[text()='Plans']");



    public EdureteHomePage (Hooks hooks) {

        this.driver= hooks.getDriver();
        //this.screenShot=new ScreenShot(driver);
    }
    public void lunchGoogleHomePage (String url){
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }
    public void enterSearchWordInGoogle (String item){

            WebElement element=driver.findElement(googleSearchInputElement);
            element.sendKeys(item);
            element.sendKeys(Keys.ENTER);


    }
    public void clickTheSearchTextReturned(){
        WebElement element=driver.findElement(searchTextResult);
        element.click();

    }
    public void assertTheTextResult() throws IOException {

            WebElement element = driver.findElement(logoFindOnHomePage);
           // String s = "test-output/EvidenceEdurete/Screen6.bmp";
            //this.screenShot.takeScreenShotEvidence(driver,s);
           // screenShot.takeScreenShotEvidence(driver,s);
            Point logoPosition=element.getLocation();
            System.out.println("The logo location"+logoPosition);
            int xcord=logoPosition.getX();
            int ycord=logoPosition.getY();
            Assert.assertEquals(xcord,89 + ycord, 63);


}
    public  void selectAboutPageTab() throws IOException {
        List<WebElement> element=driver.findElements(aboutUsTab);
        //String z ="test-output/EvidenceEdurete/New Bitmap Image.bmp";
        //screenShot.takeScreenShotEvidence(driver,z);
        //this.screenShot.takeScreenShotEvidence(driver,z);
        driver.manage().window().maximize();
        System.out.println("NameOfTab is:"+element.get(1).getText());
        element.get(1).click();
        //driver.navigate().forward();


    }
    public void navigateForwardToNextTab(String url){
        this.navigateToUrl(url);
    }
    public void goToPlanPageWithTab(){

        List<WebElement> element=driver.findElements(planTablocator);
        driver.manage().window().maximize();
        System.out.println("NameOfTab is:"+element.get(1).getText());
        element.get(1).click();

    }
    public void navigateBackToHomePageFromCurrentPage(){
        //driver.getCurrentUrl();
        driver.navigate().to("https://edrete.com/home");
    }

}
