package homework.day16.booking;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class BookingIzmirXpathTest {

    @Test
    public void BookingIzmirTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://booking.com");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement where = driver.findElement(By.xpath("//*[@aria-label='Type your destination' or @placeholder='Where are you going?']"));
        where.click();
        where.sendKeys("Izmir");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@data-testid='autocomplete-results' or @aria-label='List of suggested destinations' or @role='listbox']/li[1]")).click();
        LocalDate date = LocalDate.now().plusDays(1);
        date.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
        String startDateXPath = "//span[@aria-label='" + date.format(DateTimeFormatter.ofPattern("d MMMM yyyy")) +
                "']";
        String endDateXPath = "//span[@aria-label='" + date.plusDays(10).format(DateTimeFormatter.ofPattern("d MMMM " +
                "yyyy")) + "']";
        Thread.sleep(1000);
        driver.findElement(By.xpath(startDateXPath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(endDateXPath)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Search')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-testid='sorters-dropdown']//ul/li[9]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-block-id='hotel_list']//div[@data-testid='property-card'][1]//a[1]")).click();
        Thread.sleep(10000);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(tabs2.get(1));
        WebElement score = driver.findElement(By.xpath("//*[@data-testid='review-score-component']/div[1]"));
        assertTrue(Double.parseDouble(score.getText()) != 0);
        driver.close();
        driver.quit();
    }
}