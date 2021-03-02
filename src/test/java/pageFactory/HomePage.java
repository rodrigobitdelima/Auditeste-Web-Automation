package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img")
    WebElement contactPopupCloseBtn;

    @FindBy(xpath = "//*[@id=\"rodape-faixa-preta\"]/div[2]/div/div/div[1]/a")
    WebElement requestBudgetBtn;

    @FindBy(id = "menu-item-290")
    WebElement servicesMenuBtn;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void closeWelcomeContactPopup(){
        contactPopupCloseBtn.click();
    }

    public void requestBudget() {
        requestBudgetBtn.click();
    }

    public void accessMenu(String menuName){
        driver.findElement(By.xpath("//li/a[contains(.,'" + menuName + "')]")).click();
    }

    public void accessServicePage(String service) throws InterruptedException {
        openServicesSubmenu();
        driver.findElement(By.xpath("//ul/li/a[contains(.,'" + service + "')]")).click();
    }

    public boolean isBrowserAtPage(String pageTitle){
        return driver.getPageSource().contains("//" + pageTitle);
    }

    private void openServicesSubmenu() throws InterruptedException {
        servicesMenuBtn.click();
        Thread.sleep(1000L);
    }
}
