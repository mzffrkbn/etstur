package Base;

import org.junit.jupiter.api.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Method extends BaseClass {

    public WebElement findElement(String path, String type){
        WebElement e= null;
        switch (type) {
            case "id":
                e = driver.findElement(By.id(path));
                break;
            case "xpath":
                e = driver.findElement(By.xpath(path));
                break;
            case "css":
                e = driver.findElement(By.cssSelector(path));
                break;
            case "name":
                e= driver.findElement(By.name(path));
        }
        return e;
    }
    public List<WebElement> findElements(String path, String type){
        List <WebElement> e= null;
        switch (type) {
            case "id":
                e = driver.findElements(By.id(path));
                break;
            case "xpath":
                e = driver.findElements(By.xpath(path));
                break;
            case "css":
                e = driver.findElements(By.cssSelector(path));
                break;
            case "name":
                e = driver.findElements(By.name(path));
        }
        return e;
    }
    public void clickElement(String path, String type){
        WebElement e = findElement(path,type);
        e.click();
    }
    public void setElement(String path, String type, String text){
        WebElement e = findElement(path,type);
        e.sendKeys(text);
    }


    //----
    public void selectAutocomplete(String path, String type){
        List<WebElement> e = findElements(path,type);
        e.get(0).click();
    }
    public void selectHotel(String path,String type){
        clickElement(path, type);
        //List<WebElement> e = findElements(path, type);
        //e.get(2).click();
    }
    public void selectRoom(String path, String type){
        List<WebElement> e = findElements(path, type);
        e.get(0).click();
    }
//-----
    public void waitSec(int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }
}
