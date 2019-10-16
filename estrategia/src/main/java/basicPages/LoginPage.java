package basicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver navegador) {
		super(navegador);
	}

	// Inserir usuário e senha
	public LoginPage digitarLogin() {
		navegador.findElement(By.id("txtUser")).sendKeys("TesteSelenium");

		return this;
	}

	public LoginPage digitarSenha() {
		navegador.findElement(By.id("txtPsw")).sendKeys("123456");

		return this;
	}

	// Clicar em Login
	public InicialPage clicarLogin() {
		navegador.findElement(By.cssSelector("input[class='btn btn-primary btn-block']")).click();

		return new InicialPage(navegador);
	}

	public InicialPage fazerLogin() {
		digitarLogin();
		digitarSenha();
		clicarLogin();

		return new InicialPage(navegador);
	}

}
