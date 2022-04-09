package firstTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void beforeT(){
    System.out.println("Действие перед началом теста");
    }
    @AfterTest
    public void after(){
        System.out.println("Действие после теста");
    }

    @BefoMethod
    public void beforeM(){
        System.out.println("Действие перед началом Метода");
    }

    @AfterMethod
    public void afterM(){
        System.out.println("Действие после Метода");
    }



}
