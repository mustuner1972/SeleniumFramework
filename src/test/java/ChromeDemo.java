import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChromeDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Perdorues\\Desktop\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/ref=nav_logo");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.findElement(By.cssSelector("input#sp-cc-accept")).click();
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("sel");
        List<WebElement> selList = driver.findElements(By.cssSelector(".left-pane-results-container"));
        System.out.println("selList.size() = " + selList.size());
        for(WebElement listName:selList){
            System.out.println("listName.getText() = " + listName.getText());
            //System.out.println("listName.getAttribute(\"arialabel\") = " + listName.getAttribute("arialabel"));
            System.out.println("\"merhaba\" = " + "merhaba");
        }
        //driver.findElement(By.cssSelector("button#ensCloseBanner")).click();
//        String pageTitle = driver.getTitle();
//        String expectedPageTitle = "Dropdown Menus";
//        Assert.assertEquals("Page title is correct", pageTitle,expectedPageTitle);
        //driver.quit();
    }
}
