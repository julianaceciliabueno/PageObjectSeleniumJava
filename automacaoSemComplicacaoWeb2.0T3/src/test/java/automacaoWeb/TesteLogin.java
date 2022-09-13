package automacaoWeb;
import automacaoWeb.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {
    WebDriver driver;
    Driver driverWeb;

        @Before
        public void inicializaTeste(){
            driverWeb = new Driver("chrome");
            driver = driverWeb.getDriver();
            driver.get("https://qa.clude.com.br/cluder/Login/Index2?ReturnUrl=%2fcluder");
        }


        @Test
        public void primeiroTeste(){
            driver.findElement(new By.ByLinkText("Não tem uma conta? Crie agora")).click();
            driver.findElement(By.id("adopt-accept-all-button")).click();
            driver.findElement(By.id("nome")).click();
            driver.findElement(By.id("nome")).sendKeys("juliana");
            driver.findElement(By.id("cpf")).click();
            driver.findElement(By.id("cpf")).sendKeys("424.557.424-1");
            driver.findElement(By.id("dataNascimento")).click();
            driver.findElement(By.id("dataNascimento")).sendKeys("16/08/1994");
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).sendKeys("sjsjjjss");
            driver.findElement(By.id("telefone")).click();
            driver.findElement(By.id("telefone")).sendKeys("(11) 95372-6126");
            driver.findElement(By.cssSelector(".col-sm-10:nth-child(1)")).click();
            driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) .price-subtitle")).click();
            driver.findElement(By.id("numerocartao")).click();
            driver.findElement(By.id("numerocartao")).sendKeys("444444");
            driver.findElement(By.id("nomecartao")).click();
            driver.findElement(By.id("nomecartao")).sendKeys("julisns");
            driver.findElement(By.id("validadecartao")).click();
            driver.findElement(By.id("validadecartao")).sendKeys("12/25");
            driver.findElement(By.id("cvv")).click();
            driver.findElement(By.id("cvv")).sendKeys("1111");
            driver.findElement(By.cssSelector(".col-sm-10:nth-child(3)")).click();
            driver.findElement(By.cssSelector(".col-sm-12 > .round > label")).click();
            driver.switchTo().frame(0);
            driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
            driver.switchTo().defaultContent();
            driver.findElement(By.cssSelector("#btnComprar > p")).click();
        }
        @After
        public void finalizaTeste(){
            driver.quit();
        }
    }
