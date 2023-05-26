package day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","/Users/aliates/Desktop/Batch151/src/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        System.out.println("Amazon Sayfa Başlağı : " + driver.getTitle()); // sayfa başlağını verir.

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Sayfa Başlağı : " + driver.getTitle());
        System.out.println("Techproed Actual url : " + driver.getCurrentUrl());  // gidilen sayfanın url'sini verir.

      //  System.out.println(driver.getPageSource());

        System.out.println("Techproed window handle değeri : " + driver.getWindowHandle()); // Haskodunu verir.

    }
}
