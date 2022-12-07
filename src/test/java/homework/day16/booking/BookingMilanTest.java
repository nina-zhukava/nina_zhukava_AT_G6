package homework.day16.booking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BookingMilanTest {

    @Test
    public void BookingMilanTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://booking.com");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement where = driver.findElement(By.xpath("//*[@aria-label='Type your destination' or @placeholder='Where are you going?']"));
        where.click();
        where.sendKeys("milan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-testid='autocomplete-results' or @aria-label='List of suggested destinations' or @role='listbox']/li[1]")).click();
        LocalDate date = LocalDate.now().plusDays(1);
        date.format(DateTimeFormatter.ofPattern("d MMMM YYYY"));
        String startDateXPath = "//span[@aria-label='" + date.format(DateTimeFormatter.ofPattern("d MMMM YYYY")) +
                "']";
        String endDateXPath = "//span[@aria-label='" + date.plusDays(10).format(DateTimeFormatter.ofPattern("d MMMM " +
                "YYYY")) + "']";
        Thread.sleep(1000);
        driver.findElement(By.xpath(startDateXPath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(endDateXPath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Search')]")).click();
        List<WebElement> result = driver.findElements(By.xpath("//*[@data-block-id='hotel_list']//div[@data-testid='property-card']"));
        assertTrue(result.size() != 0);
        driver.close();
        driver.quit();
    }
}