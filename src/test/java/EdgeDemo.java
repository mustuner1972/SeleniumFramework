import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver" , "C:\\Users\\Perdorues\\Desktop\\resources\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/buttons.html");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.findElement(By.id("btn_one")).click();




        //driver.quit();
    }
}
