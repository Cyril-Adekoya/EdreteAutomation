package pages.EduRete;

import Handlers.WebHandlers;
import Utilities.Hooks;
import Utilities.ScreenShot;
import org.junit.Assert;
import org.openqa.selenium.*;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;

public class EdureteHomePage extends  WebHandlers{
    WebDriver driver;
    ScreenShot screenShot;


    By googleSearchInputElement = By.xpath("//input[@name='q']");
    By searchTextResult=By.xpath("//*[@id='rso']/div/div[1]/div/div[1]/a/h3/div/span");
    By logoFindOnHomePage=By.xpath("//a[@href='https://edrete.com/']");
    By aboutUsTab=By.xpath("//a[@href='https://edrete.com/about-us/']");
    By coursesTab=By.xpath("//a[text()='Courses']");
    By contactUsPage=By.xpath("//a[text()='Contact Us']");
    By planTablocator=By.xpath("//a[text()='Plans']");
    By faceBookIcon=By.xpath("//a/i[@class='fab fa-facebook']");
    By twitterIcon=By.xpath("//a/i[@class='fab fa-twitter']");
    //By twitterIcon=By.xpath("//*[@id='socials-2']/div[2]/ul/li[2]/div/div[2]/a/i[@class='fab fa-twitter']");



    public EdureteHomePage (Hooks hooks) {
        super(hooks);

        this.driver= hooks.getDriver();
        //this.screenShot=new ScreenShot(driver);
        WebHandlers handlers=new WebHandlers(hooks);
        }
    //}
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
    public void assertTheTextResult(){

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
    public  void selectAboutPageTab(){
        List<WebElement> element=driver.findElements(aboutUsTab);
        //String z ="test-output/EvidenceEdurete/New Bitmap Image.bmp";
        //screenShot.takeScreenShotEvidence(driver,z);
        //this.screenShot.takeScreenShotEvidence(driver,z);
        driver.manage().window().maximize();
        System.out.println("NameOfTab is:"+element.get(1).getText());
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        element.get(1).click();

    }

    public void openCoursesPage(){
        List<WebElement>element=driver.findElements(coursesTab);
        element.get(1).click();


    }
    public void openContactUsPage(){
        List<WebElement>elements=driver.findElements(contactUsPage);
        elements.get(1).click();
    }
    public void goToPlanPageWithTab(){

        List<WebElement> element=driver.findElements(planTablocator);
        driver.manage().window().maximize();
        System.out.println("NameOfTab is:"+element.get(1).getText());
        element.get(1).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void navigateBackToHomePageFromCurrentPage(){

        driver.navigate().to("https://edrete.com/home");
    }
    public void selectFacebookIconHomePage(){
        this.navigateBackToHomePageFromCurrentPage();
        List<WebElement>elements=driver.findElements(faceBookIcon);
        elements.get(1).click();
        driver.findElement(By.xpath("//button[@title='Accept All']")).click();
        driver.navigate().back();
    }
    public void scrollDownHomePage(){
        this.scrollFullLengthCommand();
        driver.manage().window().maximize();


    }
    public void selectTwitterIconHomePage(){
        this.scrollFullLengthCommand();
        driver.manage().window().maximize();
        driver.findElement(twitterIcon).click();


    }

}
