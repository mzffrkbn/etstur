package Scenario;

import Base.BaseClass;
import Base.Method;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class testScenario extends BaseClass {

    Method x = new Method();

    @Test
    public void test() throws Exception {

        //Arama
        x.waitSec(2);
        x.setElement("tb-autocomplete", "id", "Antalya Otelleri");
        x.waitSec(2);
        x.selectAutocomplete("li[class='active LIST']", "css");
        x.waitSec(2);
        //tarihi aralığı seçimi
        x.clickElement("checkIn", "id");
        x.clickElement("//*[@id=\"sf-hotelSearchForm\"]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/table/tbody/tr[6]/td[1]", "xpath");
        x.clickElement("//*[@id=\"sf-hotelSearchForm\"]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/table/tbody/tr[6]/td[5]", "xpath");
        // Arama butonu
        x.clickElement("button[class='col-12 btn btn-primary btn-lg btn-search']", "css");
        x.waitSec(2);

        // Otel seçimi 2. sıradaki oteli seçiyorum
        x.selectHotel("div[data-position='2']", "css");
        x.waitSec(2);

        // yeni sayfaya geç
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        //oda seç
        x.selectRoom("//*[@id=\"hotelRoomList\"]/div[4]/div[3]/ul/li/div[2]/div/div[2]/a", "xpath");
        x.waitSec(2);
        //1. kişi
        x.clickElement("//*[@id=\"guestInformation-0-0\"]/div/div/div/div/div[3]/div[1]/div[2]/label", "xpath");
        x.setElement("tb-name_0_0", "id", "muzaffer");
        x.setElement("tb-surname_0_0", "id", "kaban");
        x.setElement("tb-birthdate_0_0", "id", "01.01.1984");
        x.setElement("tb-email_0_0", "id", "muzafferanil@gmail.com");
        x.setElement("contactFormPhoneNumber-g1", "id", "5302329362");
        x.setElement("tckn_0_0", "id", "30061551708");
        //2. kişi
        x.clickElement("//*[@id=\"guestInformation-0-1\"]/div/div/div/div/div[3]/div[1]/div[1]/label", "xpath");
        x.setElement("tb-name_0_1", "id", "Nurşen");
        x.setElement("tb-surname_0_1", "id", "kaban");
        x.setElement("tb-birthdate_0_1", "id", "01.01.1984");
        x.setElement("tckn_0_1", "id", "20507361206");
        x.clickElement("btn-preBook", "id");

        // Ödeme bilgileri girişi
        x.clickElement("//*[@id=\"accordionPayment\"]/div/div[1]", "xpath");
        x.setElement("creditCardOwnerName", "id", "MUZAFFER ANIL KABAN");
        x.setElement("tb-creditCardNumber", "id", "5269 1101 3456 1234");
        x.setElement("creditCardValidMonth", "name", "01");
        x.setElement("creditCardValidYear", "name", "25");
        x.setElement("creditCardCVC", "name", "000");
    }


}