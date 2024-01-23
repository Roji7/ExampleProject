package exampleproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplerun {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://stg.masterbo.in/admin/");
	WebElement UN = driver.findElement(By.name("username"));
	UN.sendKeys("roji");
	WebElement PW = driver.findElement(By.name("password"));
	PW.sendKeys("testing");
	WebElement Login = driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']"));
	Login.click();
    // Find all the links on the page
    List<WebElement> links = driver.findElements(By.tagName("a"));

    for (WebElement link : links) {
        String url = link.getAttribute("href");
        if (url != null && !url.isEmpty()) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println("Broken Link: " + url + " - Response Code: " + responseCode);
                } else {
                    System.out.println("Valid Link: " + url + " - Response Code: " + responseCode);
                }
                connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    driver.quit();
}
}

