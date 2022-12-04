package classwork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Weather {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.xpath("//div[text()='Acceptă tot']")).click();
        WebElement search = driver.findElement(By.name("q"));
        search.click();
        search.sendKeys("Погода Минск");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]//span[text()='погода минск']")).click();
        DayOfWeek dayOfWeek = LocalDate.now().plusDays(1).getDayOfWeek();
        String nextDayXpath = "//*[name()='text' and contains(@aria-label,'" + dayOfWeek.getDisplayName(TextStyle.FULL
                , new Locale("ro", "RO")) + " 12:00')][1]";
        String str = driver.findElement(By.xpath(nextDayXpath)).getAttribute("aria-label");
        System.out.println(Arrays.stream(str.split("Celsius")).findFirst().get());
        driver.close();
        driver.quit();
    }
}
