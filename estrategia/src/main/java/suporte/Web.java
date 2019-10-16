package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){
        // Abrir navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naty\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Entrar no site
        navegador.get("https://estrategia-erika.mereo.com/Login.aspx");

        return navegador;
    }
}
