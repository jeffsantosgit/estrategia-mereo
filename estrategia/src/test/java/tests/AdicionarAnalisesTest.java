package tests;

import basicPages.LoginPage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gestaoCiclosPage.AnalisesPage;
import gestaoCiclosPage.CiclosEstrategicosPage;
import gestaoCiclosPage.InicialPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import suporte.Web;
import org.openqa.selenium.WebDriver;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/features/Login.feature",
//glue = { "" }, monochrome = true, dryRun = false)

public class AdicionarAnalisesTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void AdicionarAnalises() throws Exception {

        new LoginPage(navegador)
                .fazerLogin();

        new InicialPage(navegador)
                .conferirTelaInicial()
                .clicarGestaoDeCiclos();

        new CiclosEstrategicosPage(navegador)
                .selecionarCicloCriado()
                .selecionarAnalises();

        new AnalisesPage(navegador)
                .adicionarNovaAnaliseInterna()
                .editarAnalise()
                .excluirAnalise()
                .adicionarNovaAnaliseExterna()
                .adicionarNovaAnaliseInterna()
                .retornarPaginaCicloEstrategico();
}
@After
public void tearDown(){
        navegador.quit();
        }
        }
