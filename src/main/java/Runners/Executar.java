package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "Steps",
        tags = "@TesteWeb",
        plugin = { "pretty", "html:target/report.html" },
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Executar {

    public static WebDriver driver;

    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Iniciou");

    }

    @AfterClass
    public static void stop() throws InterruptedException {
        Thread.sleep(15000);
        driver.quit();

    }
}
