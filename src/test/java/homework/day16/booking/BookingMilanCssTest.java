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

public class BookingMilanCssTest {

    @Test
    public void BookingMilanTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://booking.com");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement where = driver.findElement(By.cssSelector("input[placeholder='Where are you going?']"));
        where.click();
        where.sendKeys("milan");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("li[role=option]:nth-child(1), ul[data-testid='autocomplete-results']>li:nth-child(1)")).click();
        LocalDate date = LocalDate.now().plusDays(1);
        date.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
        String startDateCss = "span[aria-label='" + date.format(DateTimeFormatter.ofPattern("d MMMM yyyy")) +
                "']";
        String endDateCss = "span[aria-label='" + date.plusDays(10).format(DateTimeFormatter.ofPattern("d MMMM " +
                "yyyy")) + "']";
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(startDateCss)).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(endDateCss)).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div>div>button[type='submit']>span")).click();
        List<WebElement> result = driver.findElements(By.cssSelector(" div[data-testid='property-card']"));
        assertTrue(result.size() != 0);
        driver.close();
        driver.quit();
    }
}