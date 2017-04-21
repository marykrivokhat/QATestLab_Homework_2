import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Mary on 20-Apr-17.
 */

//Скрипт А. Логин в Админпанель:
public class Script_A {
    public static void main(String[] args) {
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        //Открываем страницу Админпанели:
        WebDriver driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));

        //Вводим логин, пароль и нажимаем кнопку «Вход»:
        driver.findElement(By.name("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement logInButton = driver.findElement(By.className("ladda-label"));
        logInButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("employee_avatar_small")));

        //После входа в систему нажимаем на пиктограмме пользователя в верхнем правом углу и выбираем опцию «Выход»:
        WebElement profileIcon = driver.findElement(By.className("employee_avatar_small"));
        profileIcon.click();
        WebElement logOutButton = driver.findElement(By.linkText("Выход"));
        logOutButton.click();

    }
}
