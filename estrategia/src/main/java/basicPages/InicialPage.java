package basicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicialPage extends BasePage {
    public InicialPage(WebDriver navegador){
        super(navegador);
    }

    public InicialPage conferirTelaInicial(){

    navegador.findElement(By.xpath("//*[@id=\"pnBody\"]/div/div/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div/h3"));

        return this;
    }
}
