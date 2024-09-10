package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By; // Make sure this is imported
import java.net.URL;

public class AppTest {

    public static void main(String[] args) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", "/path/to/your/app.apk");

        // Instantiate AppiumDriver
        AppiumDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        // Find an element and click on it using By.id
        WebElement element = driver.findElement(By.id("element_id"));
        element.click();

        // Close the driver
        driver.quit();
    }
}
