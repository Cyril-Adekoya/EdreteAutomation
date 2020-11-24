package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {

    WebDriver driver;
    String fileWithPath;
    //String Ticket10_ActualResultf;

    public ScreenShot(WebDriver driver) throws IOException {

        this.driver=driver;
        //this.fileWithPath="test-output/Evidence/New Bitmap Image.bmp";
        //this.Ticket10_ActualResultf="test-output/Evidence/New Bitmap Image (2).bmp";
        //this.takeScreenShotEvidence(driver,"test-output/Evidence/New Bitmap Image.bmp");



    }

    public void takeScreenShotEvidence(WebDriver driver,String fileWithPath) throws IOException {
   // fileWithPath=fileWithPath;
    TakesScreenshot scrShot=((TakesScreenshot) driver);
    File ScrFile=scrShot.getScreenshotAs(OutputType.FILE);
        //String absolutePath = /ScrFile.getAbsolutePath();
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(ScrFile,DestFile);
}


}
