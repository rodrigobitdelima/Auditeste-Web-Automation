package StepDefinitions;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    WebDriver driver = null;
    HomePage homePage;

    @Dado("que cliente acessa o site da Auditeste")
    public void accessAuditesteSite() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://auditeste.com.br");
        homePage = new HomePage(driver);
        homePage.closeWelcomeContactPopup();
    }

    @Quando("aciona o link para solicitação de orçamento")
    public void requestBudget() {
        homePage.requestBudget();
    }

    @Quando("^aciona o menu (.*)$")
    public void accessMenu(String menuName) {
        homePage.accessMenu(menuName);
    }

    @Quando("acessa a página do serviço (.*)$")
    public void accessServicePage(String service) throws InterruptedException {
        homePage.accessServicePage(service);
    }

    @Entao("^cliente é redirecionado para a página (.*)$")
    public void isBrowserAtPage(String pageTitle) {
        Assert.assertTrue(homePage.isBrowserAtPage(pageTitle));
        driver.close();
        driver.quit();
    }

}
