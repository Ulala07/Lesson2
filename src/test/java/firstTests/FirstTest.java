package firstTests;

import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver");
        Object ChromeDriver;
        ChromeDriver = new ChromeDriver();

        driver.get("https://www.wildberries.ru/");

        driver.quit();
    }
}
