import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/button"));

        emailInput.sendKeys("webinar.test@gmail.com");
        passwordInput.sendKeys("Xcg7299bnSmMuRLp9ITw");
        loginButton.click();

        Thread.sleep(5000);

        WebElement dashboard = driver.findElement(By.id("tab-AdminDashboard"));

        dashboard.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);


        //driver.navigate().back(); используется, чтобы действовать за теми же id элементов (если переходить на некоторые из элементов меню
        //id может меняться), что есть, когда отображена страница Dashboard
        //Thread.sleep(1000); после driver.navigate().back(); использовать необязательно, но это делает выполнение теста более наглядным
        WebElement orders = driver.findElement(By.id("subtab-AdminParentOrders"));

        orders.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement catalog = driver.findElement(By.id("subtab-AdminCatalog"));

        catalog.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement customer = driver.findElement(By.id("subtab-AdminParentCustomer"));

        customer.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement customerThreads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));

        customerThreads.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement stats = driver.findElement(By.id("subtab-AdminStats"));

        stats.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement modules = driver.findElement(By.id("subtab-AdminParentModulesSf"));

        modules.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement design = driver.findElement(By.id("subtab-AdminParentThemes"));

        design.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement shipping = driver.findElement(By.id("subtab-AdminParentShipping"));

        shipping.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement payment = driver.findElement(By.id("subtab-AdminParentPayment"));

        payment.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement international = driver.findElement(By.id("subtab-AdminInternational"));

        international.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement parameters = driver.findElement(By.id("subtab-ShopParameters"));

        parameters.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(1000);

        WebElement advancedParameters = driver.findElement(By.id("subtab-AdminAdvancedParameters"));

        advancedParameters.click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(4000);

        driver.quit();

    }

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resourses//chromedriver.exe");
        return new ChromeDriver();
    }
}
