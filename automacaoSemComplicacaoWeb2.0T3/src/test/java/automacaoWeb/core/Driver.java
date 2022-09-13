package automacaoWeb.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class Driver {
    private WebDriver driver;

    public Driver(String navegador){
                switch (navegador){
                   //abrir chrome
                   case "chrome":
                       WebDriverManager.chromedriver().setup();
                       driver = new ChromeDriver();
                       break;
                  //abrir edge
                   case "edge":
                       WebDriverManager.edgedriver().setup();
                       driver = new EdgeDriver();
                       break;
                   //abrir firefox
                   case "firefox":
                       WebDriverManager.firefoxdriver().setup();
                       driver = new FirefoxDriver();
                       break;
                   default:
                       //abrir chrome
                       WebDriverManager.chromedriver().setup();
                       driver = new ChromeDriver();
                       break;
                }


        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
