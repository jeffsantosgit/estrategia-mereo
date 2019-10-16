package stepDefinitions;

import basicPages.InicialPage;
import basicPages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	LoginPage login;
	InicialPage telaInicial;

	@Given("que o usuario esteja na tela de login")
	public void telaLogin() throws Throwable {

	}

	@When("informar os dados validos")
	public void informarDados() throws Throwable {

		login.digitarLogin();
		login.digitarSenha();

	}

	@Then("o sistema realiza o login")
	public void fazerLogin() throws Throwable {

		login.clicarLogin();

	}

	@Then("exibe a tela inicial do sistema")
	public void telaInicial() throws Throwable {

		telaInicial.conferirTelaInicial();

	}

}
