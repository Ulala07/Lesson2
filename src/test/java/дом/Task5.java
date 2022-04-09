package дом;

import java.util.NoSuchElementException;

public class Task5 {
    public static WebDriver driver;
    public static boolean isElementPresent (By locator) {
        try{
            driver.findElement (locator);
        } catch (NoSuchElementException e){
            return false;
        }
        return true;
    }
}
