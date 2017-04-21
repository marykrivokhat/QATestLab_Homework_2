import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Mary on 20-Apr-17.
 */
//Скрипт Б. Проверка работоспособности главного меню Админпанели
public class Script_B {
    public static void main(String[] args) {
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        //Заходим в Админпанель:
        WebDriver driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");   //Открываем страницу Админ панели
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
        driver.findElement(By.name("email")).sendKeys("webinar.test@gmail.com");   //Логин в Админпанель
        driver.findElement(By.name("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");   //Логин в Админпанель
        WebElement logInButton = driver.findElement(By.className("ladda-label"));
        logInButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Заказы")));

        /////////////////////Для подменю "Заказы"///////////////////
        WebElement Orders = driver.findElement(By.linkText("Заказы"));
        Orders.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Orders);
        //Обозначим переменной заголовок ДО обновления странички:
        WebElement titleBeforeRefresh = driver.findElement(By.className("page-title"));
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Заказы")));
        //Обозначим переменной заголовок ПОСЛЕ обновления странички:
        WebElement titleAfterRefresh = driver.findElement(By.className("page-title"));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Каталог"///////////////////
        WebElement Catalog = driver.findElement(By.linkText("Каталог"));
        Catalog.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Catalog);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Каталог")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Клиенты"///////////////////
        WebElement Clients = driver.findElement(By.linkText("Клиенты"));
        Clients.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Clients);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Клиенты")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Служба поддержки"//////////
        WebElement Helpdesk = driver.findElement(By.linkText("Служба поддержки"));
        Helpdesk.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Helpdesk);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Служба поддержки")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Статистика"////////////////
        WebElement Statistics = driver.findElement(By.linkText("Статистика"));
        Statistics.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Statistics);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Статистика")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Modules"///////////////////
        WebElement Modules = driver.findElement(By.linkText("Modules"));
        Modules.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Modules);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Modules")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Design"////////////////////
        WebElement Design = driver.findElement(By.linkText("Design"));
        Design.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Design);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Design")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Доставка"//////////////////
        WebElement Delivery = driver.findElement(By.linkText("Доставка"));
        Delivery.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Delivery);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Доставка")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Способ оплаты"/////////////
        WebElement Payment = driver.findElement(By.linkText("Способ оплаты"));
        Payment.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Payment);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Способ оплаты")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "International"/////////////
        WebElement International = driver.findElement(By.linkText("International"));
        International.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(International);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("International")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Shop Parameters"///////////
        WebElement ShopParameters = driver.findElement(By.linkText("Shop Parameters"));
        ShopParameters.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(ShopParameters);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Shop Parameters")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);

        /////////////////////Для подменю "Конфигурация"//////////////
        WebElement Configuration = driver.findElement(By.linkText("Конфигурация"));
        Configuration.click();
        //Выведем в консоль заголовок открытого раздела:
        System.out.print(Configuration);
        //Обновим страничку:
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Конфигурация")));
        //Сравним заголовки ДО и ПОСЛЕ обновления:
        titleBeforeRefresh.equals(titleAfterRefresh);


    }
}


